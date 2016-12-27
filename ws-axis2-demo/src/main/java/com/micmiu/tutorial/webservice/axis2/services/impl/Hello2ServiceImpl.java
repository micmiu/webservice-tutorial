package com.micmiu.tutorial.webservice.axis2.services.impl;

import com.micmiu.tutorial.webservice.axis2.services.Hello2Service;

import javax.jws.WebService;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/24/2016
 * Time: 04:07
 */
@WebService(endpointInterface = "com.micmiu.tutorial.webservice.axis2.services.Hello2Service")
public class Hello2ServiceImpl implements Hello2Service {

	@Override
	public String sayHello(String userName) {
		return "Hi " + userName
				+ ", welcome to new www.micmiu.com.";
	}
}
