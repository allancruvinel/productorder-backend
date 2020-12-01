package com.educando.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educando.curso.entities.Order;
import com.educando.curso.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findall(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
			Optional<Order> u = repository.findById(id);
		return u.get();
	}
}
