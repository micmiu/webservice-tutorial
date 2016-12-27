package com.micmiu.tutorial.webservice.jaxws;

import com.micmiu.tutorial.webservice.jaxws.client.helloservice.Blog;
import com.micmiu.tutorial.webservice.jaxws.client.helloservice.HelloService;
import com.micmiu.tutorial.webservice.jaxws.client.helloservice.HelloServiceImplService;
import junit.framework.Assert;
import junit.framework.TestCase;
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

	private HelloService helloService = null;

	@Before
	public void setUp() {
		HelloServiceImplService service = new HelloServiceImplService();
		helloService = service.getHelloServiceImplPort();
	}

	@Test
	public void testSayHello() {
		Assert.assertEquals("Hi Michael, welcome to www.micmiu.com.", helloService.sayHello("Michael"));

	}


	@Test
	public void testQueryBlog() {

		String author = "micmiu.com";
		List<Blog> list = helloService.queryBlog(author);
		for (Blog blog : list) {
			Assert.assertEquals(author, blog.getAuthor());
		}
	}

	@Test
	public void tesCreateBlog() {

		List<Blog> newList = new ArrayList<Blog>();
		newList.add(new Blog("micmiu.com", "hadoop"));
		newList.add(new Blog("micmiu.com", "hbase"));

		Assert.assertEquals("true:size=" + newList.size(), helloService.createBlogList(newList));

	}


}
