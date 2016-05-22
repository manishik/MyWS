package com.hcl;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.interceptor.Interceptors;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(
		name="HCLMDB",
		activationConfig = {
		@ActivationConfigProperty(
		propertyName="destinationType",
		propertyValue="javax.jms.Queue"),
		@ActivationConfigProperty(
		propertyName="destination",
		propertyValue="queue/HCL")
		}
		)
		
public class HCLMDB implements MessageListener {

	@Resource
	MessageDrivenContext ctx;
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
