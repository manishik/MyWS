package com.hcl;

import javax.interceptor.Interceptors;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

@MessageDriven(
		name="testMDB",
		activationConfig = {
		@ActivationConfigProperty(
		propertyName="destinationType",
		propertyValue="javax.jms.Queue"),
		@ActivationConfigProperty(
		propertyName="destination",
		propertyValue="queue/HCL")
		}
		)
public class testMdb implements MessageListener {

	@Interceptors(value=LogInterceptorTest.class)
	public void onMessage(Message txt) {
		if (txt instanceof TextMessage) {
			TextMessage msg = (TextMessage) txt;
			try {
				String s = msg.getText();
				System.out.println("Message :" + s);
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
