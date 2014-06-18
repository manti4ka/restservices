package com.sample.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.Element;
import com.sample.Product;
import com.sample.Products;

@Service("mockService")
public class MockService {
	
	private Products products;
	
	public MockService(){
		this.products = new Products();
		ArrayList<Product> products = new ArrayList<Product>(2);
		Element el = new Element();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("map1", "value1");
		map.put("map2", "value2");
		el.setMap(map);
		List<Element> els = new ArrayList<Element>(1);
		els.add(el);
    	Product p1 = new Product("1", "test1");
    	p1.setElements(els);
    	products.add(p1);
    	Product p2 = new Product("2", "test2");	            
	    products.add(p2);
	    this.products.setProducts(products);
	    
    }
	
	public Products getAllProducts(){
		return products;
	}

	
	public Product getProductById(String id) {
		for(Product el : products.getProducts()) {
			if(el.getId().equals(id)) {
				return el;
			}
		}
		return null;
	}
	
	public Product createProduct(Product product) {
		products.getProducts().add(product);
		return product;
	}
	
	public Product updateProductById(String productId, Product product) {
	
		return null;
	}
	
	public Product deleteProductById(String productId) {
		return null;
	}
}
