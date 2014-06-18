package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.sample.Products;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "test-rest.xml" })

public class TestSampleRestService {

 @Autowired
 @Qualifier("restTemplate")
 private RestTemplate restTemplate;
 
	 @Test
	 public void restClientTest() {
	  
		 Products products = restTemplate.getForObject("http://localhost:8080/ExampleRestServicesWithSpring/products", Products.class);
	 
	 }
 

}
