package com.educando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educando.curso.entities.Product;
import com.educando.curso.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findall(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
			Optional<Product> u = repository.findById(id);
		return u.get();
	}
}
