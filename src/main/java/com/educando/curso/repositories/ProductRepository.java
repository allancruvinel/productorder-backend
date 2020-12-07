package com.educando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
