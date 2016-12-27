package com.micmiu.tutorial.webservice.cxf.services.impl;

import com.micmiu.tutorial.webservice.cxf.beans.Blog;
import com.micmiu.tutorial.webservice.cxf.services.HelloService;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 9:55
 */
@WebService(endpointInterface = "com.micmiu.tutorial.webservice.cxf.services.HelloService")
public class HelloServiceImpl implements HelloService {

	public String sayHello(String userName) {
		return "Hi " + userName
				+ ", welcome to www.micmiu.com.";
	}

	@Override
	public List<Blog> queryBlog(@WebParam(name = "author") String author) {
		List<Blog> list = new ArrayList<Blog>();
		list.add(new Blog(author, "webservice"));
		list.add(new Blog(author, "jax-ws"));
		return list;
	}

	@Override
	public String createBlogList(@WebParam(name = "blogList") List<Blog> blogList) {

		if (null != blogList) {
			for (Blog blog : blogList) {
				System.out.println(">>  param = " + blog);
			}
			return "true:size=" + blogList.size();
		} else {
			return "false";
		}

	}
}
