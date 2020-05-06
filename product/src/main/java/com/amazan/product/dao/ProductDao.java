package com.amazan.product.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.amazan.product.model.Product;
@Repository
public class ProductDao {
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
	   
	   
	   public Map<String, Product> getProducts()
	   {
		   System.out.println("------------ProductDao :: getProducts()-------- "+products.toString()); 
		   
		   return  products;
	   }

}
