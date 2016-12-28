package com.micmiu.tutorial.webservice.cxf;

import com.micmiu.tutorial.webservice.cxf.services.HelloService;
import com.micmiu.tutorial.webservice.cxf.services.impl.HelloServiceImpl;
import org.apache.cxf.frontend.ServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:07
 */
public class ServerFactoryServiceRunner {

	public static void main(String[] args) {
		System.out.println("start publish jax-ws ...");

		ServerFactoryBean svrFactory = new ServerFactoryBean();
		svrFactory.setServiceClass(HelloService.class);
		svrFactory.setAddress("http://0.0.0.0:8082/HelloService");
		svrFactory.setServiceBean(new HelloServiceImpl());
		svrFactory.create();
		System.out.println("publish webservice successful");
	}
}
