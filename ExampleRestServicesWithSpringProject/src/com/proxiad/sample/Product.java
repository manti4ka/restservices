package com.proxiad.sample;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {

	private String id;
	
	private String name;
	
	private List<Element> elements;

	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Product() {
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public List<Element> getElements() {
		return elements;
	}
	
}
