package com.micmiu.tutorial.webservice.axis2.services;


import com.micmiu.tutorial.webservice.axis2.beans.Blog;

import java.util.List;

/**
 * Created for demo
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 8:14
 */
public interface HelloService {

	String sayHello(String userName);

	List<Blog> queryBlog(String author);

	String createBlogList(List<Blog> blogList);
}