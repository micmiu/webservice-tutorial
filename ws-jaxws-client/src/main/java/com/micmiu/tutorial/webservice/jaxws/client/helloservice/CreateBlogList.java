
package com.micmiu.tutorial.webservice.jaxws.client.helloservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBlogList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBlogList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blogList" type="{http://services.jaxws.webservice.tutorial.micmiu.com/}blog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBlogList", propOrder = {
    "blogList"
})
public class CreateBlogList {

    protected List<Blog> blogList;

    /**
     * Gets the value of the blogList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blogList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlogList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.micmiu.tutorial.webservice.jaxws.client.helloservice.Blog }
     * 
     * 
     */
    public List<Blog> getBlogList() {
        if (blogList == null) {
            blogList = new ArrayList<Blog>();
        }
        return this.blogList;
    }

}
