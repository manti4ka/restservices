package com.sample.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.Product;
import com.sample.Products;
import com.sample.service.MockService;

@Controller
public class ProductsController {

	 	@Autowired 
	 	private MockService mockService;
	
	    @RequestMapping(value="products", method = RequestMethod.GET)
	    @ResponseBody
	    public Products getAllProducts() {	        
	        return mockService.getAllProducts();
	    }
	    
	    @RequestMapping(value="products/{productId}", method = RequestMethod.GET)
	    @ResponseBody
	    public Product getProductById(@PathVariable("productId")  String productId) {
	            
	        return mockService.getProductById(productId);
	    }
	    
	    @RequestMapping(value="product", method = RequestMethod.POST)
	    @ResponseBody
	    public Product createProduct(@RequestBody Product product) {
	        return mockService.createProduct(product);
	    }
	    
	    @RequestMapping(value="product/{productId}", method = RequestMethod.PUT)
	    @ResponseBody
	    public Product updateProductById(@PathVariable("productId")  String productId, @RequestBody Product product) {
	    	return mockService.updateProductById(productId, product);
	    }
	    
	    @RequestMapping(value="product/{productId}", method = RequestMethod.DELETE)
	    @ResponseBody
	    public Product deleteProductById(@PathVariable("productId")  String productId) {	      
	        return null;
	    }
	    
	    
}