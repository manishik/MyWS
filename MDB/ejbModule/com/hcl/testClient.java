package com.hcl;

import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class testClient {
	QueueConnection conn;

	QueueSession session;

	Queue que;

	public static void main(String[] args) {
		try{
			testClient send = new testClient();
			send.setupPTP();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void setupPTP()

	throws JMSException, NamingException

	{
		Properties prop = new Properties();
		prop.setProperty("java.naming.factory.initial",
				"org.jnp.interfaces.NamingContextFactory");
		prop.setProperty("java.naming.provider.url",
				"jnp://localhost:1099");
		prop.setProperty("java.naming.factory.url.pkgs",
				"org.jboss.naming:org.jnp.interfaces");
		

		InitialContext iniCtx = new InitialContext(prop);

		Object tmp = iniCtx.lookup("ConnectionFactory");

		QueueConnectionFactory qcf = (QueueConnectionFactory) tmp;

		conn = qcf.createQueueConnection();

		que = (Queue) iniCtx.lookup("queue/HCL");

		session = conn.createQueueSession(false,

		QueueSession.AUTO_ACKNOWLEDGE);

		conn.start();
		QueueSender qSender = session.createSender(que);
		TextMessage tMsg = session.createTextMessage();
		
		tMsg.setText("This is from test client ..");
		
		qSender.send(tMsg);
		
	/*	StreamMessage sm = session.createStreamMessage();
		sm.writeString("This is example");
		sm.writeInt(300);
		sm.writeString("This is example second");
		
		
		MapMessage mMess  = session.createMapMessage();
		mMess.setString("one", "sss");
		mMess.setInt("two",400); */
		/*for(int i=0;i<10;i++){
			TextMessage tMsg = session.createTextMessage();
			if(i % 2 == 0){
				tMsg.setJMSCorrelationID("123456");
				System.out.println("The correletion id is "+tMsg.getJMSCorrelationID());
			}
			tMsg.setText("This is the message .. "+i);
			qSender.send(tMsg);
			//System.out.println(tMsg);
		}*/
		

	}


}