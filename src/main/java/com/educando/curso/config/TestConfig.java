package com.educando.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educando.curso.entities.Category;
import com.educando.curso.entities.Order;
import com.educando.curso.entities.Product;
import com.educando.curso.entities.User;
import com.educando.curso.entities.enums.OrderStatus;
import com.educando.curso.repositories.CategoryRepository;
import com.educando.curso.repositories.OrderRepository;
import com.educando.curso.repositories.ProductRepository;
import com.educando.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null,"pratos");
		Category c2 = new Category(null,"Bebidas");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		User u1 = new User("Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User("Alex Green", "alex@gmail.com", "977777777", "123456"); 

		Order o1 = new Order(Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.SHIPPED, u1);
		Order o2 = new Order(Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.SHIPPED, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
	}
	
	
}
