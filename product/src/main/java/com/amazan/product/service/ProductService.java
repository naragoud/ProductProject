package com.amazan.product.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazan.product.dao.ProductDao;
import com.amazan.product.model.Product;
@Service
public class ProductService {
	
	@Autowired
	ProductDao producDao;

	public Map<String, Product> getProductDetails() {
		// TODO Auto-generated method stub
		 Map<String, Product> products = producDao.getProducts();
		
		return products;
	}
	
	

}
