package com.micmiu.tutorial.webservice.cxf;

import com.micmiu.tutorial.webservice.cxf.services.HelloService;
import com.micmiu.tutorial.webservice.cxf.services.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:07
 */
public class HelloServiceRunner {

	public static void main(String[] args) {
		System.out.println("start publish jax-ws ...");
		HelloService service = new HelloServiceImpl();
		Endpoint.publish("http://0.0.0.0:8082/HelloService", service);
		System.out.println("publish webservice successful");
	}
}
