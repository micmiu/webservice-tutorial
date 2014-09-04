package com.micmiu.tutorial.webservice.xfire;

import com.micmiu.tutorial.webservice.xfire.beans.Blog;
import com.micmiu.tutorial.webservice.xfire.services.HelloService;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:26
 */

public class HelloClientTest extends TestCase {

	public static final String URL = "http://localhost:8083/HelloService";

	private HelloService service = null;

	@Before
	public void setUp() throws Exception{
		System.out.println(" ----> 初始客户端 <---- ");
		// Create a service model for the client
		ObjectServiceFactory serviceFactory = new ObjectServiceFactory();
		Service serviceModel = serviceFactory
				.create(HelloService.class);

		// Create a client proxy
		XFireProxyFactory proxyFactory = new XFireProxyFactory();
		service = (HelloService) proxyFactory.create(
				serviceModel, URL);
	}

	@Test
	public void testSayHello() {
		Assert.assertEquals("Hi Michael, welcome to www.micmiu.com.", service.sayHello("Michael"));

	}


	@Test
	public void testQueryBlog() {

		String author = "micmiu.com";
		List<Blog> list = service.queryBlog(author);
		for (Blog blog : list) {
			Assert.assertEquals(author, blog.getAuthor());
		}
	}

	@Test
	public void tesCreateBlog() {

		List<Blog> newList = new ArrayList<Blog>();
		newList.add(new Blog("micmiu.com", "hadoop"));
		newList.add(new Blog("micmiu.com", "hbase"));

		Assert.assertEquals("true:size=" + newList.size(), service.createBlogList(newList));

	}


}
