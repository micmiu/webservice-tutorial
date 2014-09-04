package com.micmiu.tutorial.webservice.xfire.beans;

import java.io.Serializable;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 8/29/2014
 * Time: 10:11
 */
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;

	public Blog() {
	}

	public Blog(String author, String title) {
		this.author = author;
		this.title = title;
	}

	private String author;

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Blog{");
		sb.append("author='").append(author).append('\'');
		sb.append(", title='").append(title).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
