package com.educando.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educando.curso.entities.User;

@RestController
@RequestMapping(value = "/")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"ae","ae","ae","ase");
		System.out.println("entrou na rota");
		return ResponseEntity.ok().body(u);
	}
}
