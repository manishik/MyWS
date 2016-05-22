package com.hcl.manish.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceFactory;

import com.hcl.manish.interfaces.remote.Calculator;

public class Client
{
   public static void main(String[] args) throws Exception
   {
      URL url = new URL("http://localhost:8080/EJBasWebService/CalcBean?wsdl");
      System.out.println("URL = "+url);
      QName qname = new QName("http://penstock.indudhar.manish.hcl.com/", "CalculatorBeanService");
      System.out.println("QName = "+qname);
      ServiceFactory factory = ServiceFactory.newInstance();
      System.out.println("Factory = "+factory);
      Service service = factory.createService(url,null);
      Calculator calculator = (Calculator) service.getPort(Calculator.class);

      System.out.println("Result = " + calculator.add(11, 11));
      System.out.println("Result = " + calculator.subtract(111, 11));
      System.out.println("The res is "+calculator.getResult());
   }
}
