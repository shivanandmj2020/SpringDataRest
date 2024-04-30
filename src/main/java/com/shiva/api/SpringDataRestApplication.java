package com.shiva.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringDataRestApplication {
	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void init(){
		repository.saveAll(Stream.of(
				new ApplicationUser(101, "Pratik", "p@gmail.com"),
				new ApplicationUser(102, "Dileep", "d@gmail.com"),
				new ApplicationUser(103, "ram", "ram@gmail.com"),
				new ApplicationUser(104, "shiva", "shiva@gmail.com"))
				.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

}
