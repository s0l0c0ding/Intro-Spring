package com.solocoding.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.solocoding.application.daoQuery.FamousRepo;
import com.solocoding.application.entity.Famous;

@SpringBootApplication
public class FamousApplication implements CommandLineRunner{

	@Autowired
	FamousRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(FamousApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Famous first = new Famous();
		first.setName("Bill");
		first.setSurname("Gates");
		first.setFortune(106);
		
		Famous second = new Famous();
		second.setName("Mark");
		second.setSurname("Zuckerberg");
		second.setFortune(75);
		
		System.out.println(repo.save(first).toString());
		System.out.println(repo.save(second).toString());
		
		
	}

}
