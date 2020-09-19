package com.solocoding.application.controller;

import java.util.List;

import com.solocoding.application.dto.FamousDto;
import com.solocoding.application.entity.Famous;
import com.solocoding.application.logic.FamousDtoLogic;
import com.solocoding.application.repository.FamousRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public FamousDto savFam (@RequestBody FamousDto input) {
		return  logic.insertFamous(input); 
	}
	
	@GetMapping("/richest")
	public FamousDto findR () {
		return logic.findTheRichest();
	}
	
	@GetMapping("/find/{name}")
	public Famous findByName (@PathVariable String name) {
		return repo.findByName(name);
	}
}
