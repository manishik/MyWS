package com.hcl.manish.interfaces.remote;

import java.rmi.Remote;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.hcl.manish.engineer.ws.ct.Employee;

@WebService(name = "Engineer", targetNamespace = "http://manish.hcl.com/engineer/ws")
@XmlSeeAlso( { com.hcl.manish.engineer.ws.ObjectFactory.class,
		com.hcl.manish.engineer.ws.ct.ObjectFactory.class })

public interface Calculator extends Remote {

	@WebMethod(operationName = "Add", action = "http://manish.hcl.com/engineer/ws/Add")
	@WebResult(name = "sum", targetNamespace = "")
	@RequestWrapper(localName = "Add", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.Add")
	@ResponseWrapper(localName = "AddResponse", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.AddResponse")
	public int add(@WebParam(name = "x", targetNamespace = "")int x, 
					@WebParam(name = "y", targetNamespace = "")int y);

	@WebMethod(operationName = "Sub", action = "http://manish.hcl.com/engineer/ws/Sub")
	@WebResult(name = "value", targetNamespace = "")
	@RequestWrapper(localName = "Sub", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.Sub")
	@ResponseWrapper(localName = "SubResponse", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.SubResponse")
	public double subtract(@WebParam(name = "x", targetNamespace = "")double x, 
							@WebParam(name = "y", targetNamespace = "")double y);

	//public boolean addEmp(Employee emp);

	@WebMethod(operationName = "AddEmployee", action = "http://manish.hcl.com/engineer/ws/AddEmployee")
    @WebResult(name = "AddEmpResp", targetNamespace = "")
    @RequestWrapper(localName = "AddEmployee", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.AddEmployee")
    @ResponseWrapper(localName = "AddEmployeeResponse", targetNamespace = "http://manish.hcl.com/engineer/ws", className = "com.hcl.manish.engineer.ws.AddEmployeeResponse")
    public boolean addEmp(
    		@WebParam(name = "AddEmp", targetNamespace = "")Employee addEmp);
	
	float multiply(float a, float b);
	
	String getResult();
}
