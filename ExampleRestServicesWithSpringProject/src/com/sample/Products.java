package com.sample;


import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Products {

	private List<Product> products;

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}
}
