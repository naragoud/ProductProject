package com.amazan.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.amazan.product.model.Product;
import com.amazan.product.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	private static Map<String, Product> products = new HashMap<>(); 
	static {
	      Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      products.put(honey.getId(), honey);
	      
	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      products.put(almond.getId(), almond);
	   }
	   
	@RequestMapping(value = "/getproducts")
	public ResponseEntity<Object>  getProducts() {
	System.out.println("ProductController::getproducts------>>>" + products.toString() );
	Map<String, Product> products = service.getProductDetails();	
	return new ResponseEntity<>(products.values(), HttpStatus.OK);
	}

}
