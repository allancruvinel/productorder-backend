package com.educando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educando.curso.entities.Category;
import com.educando.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findall(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
			Optional<Category> u = repository.findById(id);
		return u.get();
	}
}
