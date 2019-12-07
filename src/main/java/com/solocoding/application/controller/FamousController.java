package com.solocoding.application.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solocoding.application.daoQuery.FamousRepo;
import com.solocoding.application.dto.FamousDto;
import com.solocoding.application.entity.Famous;
import com.solocoding.application.logic.FamousDtoLogic;

@RestController
public class FamousController {

	private FamousDtoLogic logic;
	private FamousRepo repo;
	
	public FamousController(FamousDtoLogic logic, FamousRepo repo) {
		this.logic = logic;
		this.repo = repo;
	}
	
	@GetMapping("/all")
	public List<FamousDto> getALl () {
		return logic.getAll();
	}
	
	@PostMapping
	public ResponseEntity<Integer> savFam (@RequestBody FamousDto input) {
		Integer result = logic.insertFamous(input);
		if (result == 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		return  new ResponseEntity<>(result, HttpStatus.OK); 
	}
	
	@GetMapping("/findR")
	public FamousDto findR () {
		return logic.findTheRichest();
	}
	
	@GetMapping("/findByName/{name}")
	public Famous findByName (@PathVariable String name) {
		return repo.findByName(name);
	}
}
