package com.example.UserCredit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserCredit.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List <Product> findByTitle(String title);
}
