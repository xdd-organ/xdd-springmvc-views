package com.java.xdd.web.pojo;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coffee")
public class Article {
	private String title;
	private String content;
	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	@XmlElement
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Article [ title=" + title + ", content="
				+ content + "]";
	}
	
}
