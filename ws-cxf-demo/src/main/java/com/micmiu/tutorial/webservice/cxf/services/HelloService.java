package com.micmiu.tutorial.webservice.cxf.services;

import com.micmiu.tutorial.webservice.cxf.beans.Blog;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created for demo
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 8:14
 */
@WebService(serviceName = "HelloService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface HelloService {


	@WebMethod
	//指定targetNamespace  否则axis2 ServiceClient方式调用失败
	String sayHello(@WebParam(name = "userName", targetNamespace = "http://services.cxf.webservice.tutorial.micmiu.com/") String userName);

	@WebMethod
	List<Blog> queryBlog(@WebParam(name = "author") String author);

	@WebMethod
	String createBlogList(@WebParam(name = "blogList") List<Blog> blogList);
}