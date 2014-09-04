package com.micmiu.tutorial.webservice.xfire.client;

import com.micmiu.tutorial.webservice.xfire.beans.Blog;
import com.micmiu.tutorial.webservice.xfire.services.HelloService;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 9/5/2014
 * Time: 0:12
 */
public class HelloClientMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(" ----> 初始客户端 <---- ");
			// Create a service model for the client
			ObjectServiceFactory serviceFactory = new ObjectServiceFactory();
			Service serviceModel = serviceFactory
					.create(HelloService.class);

			// Create a client proxy
			XFireProxyFactory proxyFactory = new XFireProxyFactory();
			HelloService service = (HelloService) proxyFactory.create(
					serviceModel, "http://localhost:8083/HelloService");

			System.out.println(" ---->   start webservice client ...");
			System.out.println(">>>>>   send Michael to server ");
			System.out.println(service.sayHello("Michael"));


			System.out.println(">>>>>   queryBlog");
			List<Blog> list = service.queryBlog("micmiu");

			for (Blog blog : list) {
				System.out.println(blog);
			}

			System.out.println(">>>>>   createBlog");
			List<Blog> newList = new ArrayList<Blog>();
			newList.add(new Blog("new", "test1"));
			newList.add(new Blog("new", "test12"));
			System.out.println(">>>>>   " + service.createBlogList(newList));


			System.out.println(">>>>>   test client end.");
			System.out.println(" ----> 客户端调用结束 <---- ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
