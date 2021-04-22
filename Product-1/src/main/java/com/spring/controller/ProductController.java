package com.spring.controller;

import com.spring.entity.Product;
import com.spring.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	 @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) {
	        return service.saveProduct(product);
	    }

	    @PostMapping("/addProducts")
	    public List<Product> addProducts(@RequestBody List<Product> products) {
	        return service.saveProducts(products);
	    }

	    @GetMapping("/products")
	    public List<Product> findAllProducts() {
	        return service.getProducts();
	    }

	    @GetMapping("/productById/{id}")
	    public Product findProductById(@PathVariable int id) {
	        return service.getProductById(id);
	    }

	    @GetMapping("/product/{name}")
	    public Product findProductByName(@PathVariable String name) {
	        return service.getProductByName(name);
	    }

	    @PutMapping("/update")
	    public Product updateProduct(@RequestBody Product product) {
	        return service.updateProduct(product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteProduct(id);
	    }
	}
	
	


