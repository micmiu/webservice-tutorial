package com.micmiu.tutorial.webservice.axis2.services;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created for demo
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/24/2016
 * Time: 4:06
 */
@WebService(serviceName = "Hello2Service")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface Hello2Service {

	@WebMethod
	String sayHello(@WebParam(name = "userName") String userName);
}