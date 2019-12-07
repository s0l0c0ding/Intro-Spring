package com.solocoding.application.dto;

import com.solocoding.application.entity.Famous;

public class FamousDto {

	private long id;
	private String name;
	private String surname;
	private int fortune;
	
	public FamousDto () {
	}
	public FamousDto (Famous input) {
		this.id = input.getId();
		this.name = input.getName();
		this.surname = input.getSurname();
		this.fortune = input.getFortune();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getFortune() {
		return fortune;
	}
	public void setFortune(int fortune) {
		this.fortune = fortune;
	}
	
	
}
