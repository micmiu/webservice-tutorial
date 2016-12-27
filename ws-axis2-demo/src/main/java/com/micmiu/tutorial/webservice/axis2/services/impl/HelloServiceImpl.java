package com.micmiu.tutorial.webservice.axis2.services.impl;


import com.micmiu.tutorial.webservice.axis2.beans.Blog;
import com.micmiu.tutorial.webservice.axis2.services.HelloService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 9:55
 */

public class HelloServiceImpl implements HelloService {

	public String sayHello(String userName) {
		return "Hi " + userName
				+ ", welcome to www.micmiu.com.";
	}

	@Override
	public List<Blog> queryBlog(String author) {
		List<Blog> list = new ArrayList<Blog>();
		list.add(new Blog(author, "webservice"));
		list.add(new Blog(author, "jax-ws"));
		return list;
	}

	@Override
	public String createBlogList(List<Blog> blogList) {

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
