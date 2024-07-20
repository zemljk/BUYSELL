package com.example.UserCredit.services;

import java.util.ArrayList;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.stereotype.Service;

import com.example.UserCredit.models.Product;
import com.example.UserCredit.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository;
	
	private List<Product> products =  new ArrayList<>();
	
	
	
	
	public List<Product> listProducts(String title){
		List <Product> products= productRepository.findAll(); 
		if (title != null) return productRepository.findByTitle(title);
		return productRepository.findAll();
	}
	
	public void saveProduct(Product product) {
		log.info("Saving new {}",product );
		productRepository.save(product);
	}
	
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	
	
	
}
