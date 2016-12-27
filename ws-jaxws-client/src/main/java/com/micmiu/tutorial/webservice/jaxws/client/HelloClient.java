package com.micmiu.tutorial.webservice.jaxws.client;

import com.micmiu.tutorial.webservice.jaxws.client.helloservice.Blog;
import com.micmiu.tutorial.webservice.jaxws.client.helloservice.HelloService;
import com.micmiu.tutorial.webservice.jaxws.client.helloservice.HelloServiceImplService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:26
 */
public class HelloClient {

	public static void main(String[] args) {
		HelloServiceImplService service = new HelloServiceImplService();
		HelloService hello = service.getHelloServiceImplPort();
		System.out.println(">>>>>   start webservice client ...");
		System.out.println(">>>>>   send Michael to server ");
		System.out.println(hello.sayHello("Michael"));


		System.out.println(">>>>>   queryBlog");
		List<Blog> list = hello.queryBlog("micmiu");

		for(Blog blog:list){
			System.out.println(blog);
		}

		System.out.println(">>>>>   createBlog");
		List<Blog> newList = new ArrayList<Blog>();
		newList.add(new Blog("new","test1"));
		newList.add(new Blog("new","test12"));
		System.out.println(">>>>>   "+hello.createBlogList(newList));


		System.out.println(">>>>>   test client end.");
	}
}
