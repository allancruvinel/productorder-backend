package com.educando.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
