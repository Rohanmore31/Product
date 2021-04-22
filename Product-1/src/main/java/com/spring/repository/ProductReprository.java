package com.spring.repository;

import com.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductReprository extends JpaRepository<Product,Integer> {

	Product findByName(String name);

}
