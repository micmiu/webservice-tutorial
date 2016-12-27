
package com.micmiu.tutorial.webservice.jaxws.client.helloservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.micmiu.tutorial.webservice.jaxws.client.helloservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateBlogList_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "createBlogList");
    private final static QName _QueryBlogResponse_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "queryBlogResponse");
    private final static QName _CreateBlogListResponse_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "createBlogListResponse");
    private final static QName _QueryBlog_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "queryBlog");
    private final static QName _SayHello_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://services.jaxws.webservice.tutorial.micmiu.com/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.micmiu.tutorial.webservice.jaxws.client.helloservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.QueryBlog }
     * 
     */
    public QueryBlog createQueryBlog() {
        return new QueryBlog();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.CreateBlogList }
     * 
     */
    public CreateBlogList createCreateBlogList() {
        return new CreateBlogList();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.CreateBlogListResponse }
     * 
     */
    public CreateBlogListResponse createCreateBlogListResponse() {
        return new CreateBlogListResponse();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.QueryBlogResponse }
     * 
     */
    public QueryBlogResponse createQueryBlogResponse() {
        return new QueryBlogResponse();
    }

    /**
     * Create an instance of {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.Blog }
     * 
     */
    public Blog createBlog() {
        return new Blog();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.CreateBlogList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "createBlogList")
    public JAXBElement<CreateBlogList> createCreateBlogList(CreateBlogList value) {
        return new JAXBElement<CreateBlogList>(_CreateBlogList_QNAME, CreateBlogList.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.QueryBlogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "queryBlogResponse")
    public JAXBElement<QueryBlogResponse> createQueryBlogResponse(QueryBlogResponse value) {
        return new JAXBElement<QueryBlogResponse>(_QueryBlogResponse_QNAME, QueryBlogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.CreateBlogListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "createBlogListResponse")
    public JAXBElement<CreateBlogListResponse> createCreateBlogListResponse(CreateBlogListResponse value) {
        return new JAXBElement<CreateBlogListResponse>(_CreateBlogListResponse_QNAME, CreateBlogListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.QueryBlog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "queryBlog")
    public JAXBElement<QueryBlog> createQueryBlog(QueryBlog value) {
        return new JAXBElement<QueryBlog>(_QueryBlog_QNAME, QueryBlog.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.webservice.tutorial.micmiu.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
