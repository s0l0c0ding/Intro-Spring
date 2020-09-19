package com.solocoding.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.solocoding.application.entity.Famous;
import com.solocoding.application.repository.FamousRepo;
import java.util.logging.Logger;

@SpringBootApplication
public class FamousApplication implements CommandLineRunner{

	private static final Logger log = Logger.getLogger(FamousApplication.class.getName());

	@Autowired
	private FamousRepo repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FamousApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Famous first = new Famous();
		first.setName("Bill");
		first.setSurname("Gates");
		first.setFortune(98);
		
		Famous second = new Famous();
		second.setName("Mark");
		second.setSurname("Zuckerberg");
		second.setFortune(54);
		log.info("saving two records: ");
		log.info(repo.save(first).toString());
		log.info(repo.save(second).toString());
		
		
	}

}
