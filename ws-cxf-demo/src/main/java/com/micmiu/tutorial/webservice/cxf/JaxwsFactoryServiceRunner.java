package com.micmiu.tutorial.webservice.cxf;

import com.micmiu.tutorial.webservice.cxf.services.HelloService;
import com.micmiu.tutorial.webservice.cxf.services.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:07
 */
public class JaxwsFactoryServiceRunner {

	public static void main(String[] args) {
		System.out.println("start publish ws by CXF use JaxWsServerFactoryBean ...");

		String url = "http://0.0.0.0:8082/HelloService";
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(url);
		factoryBean.setServiceClass(HelloService.class);
		factoryBean.setServiceBean(new HelloServiceImpl());
		factoryBean.create();
		System.out.println("publish webservice successful");
	}
}
