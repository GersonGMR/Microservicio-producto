package com.microProductos.microservicioproducto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microProductos.microservicioproducto.entity.Category;
import com.microProductos.microservicioproducto.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByCategory(Category category);

}
