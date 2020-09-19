package com.solocoding.application.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Famous {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank
	private String name;
	private String surname;
	private int fortune;
	@CreationTimestamp
	private Timestamp createdOn;
	
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

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public int getFortune() {
		return fortune;
	}

	public void setFortune(int fortune) {
		this.fortune = fortune;
	}

	@Override
	public String toString() {
		return "Famous [id=" + id + ", name=" + name + ", surname=" + surname + ", fortune=" + fortune + ", createdOn="
				+ createdOn + "]";
	}
	
	
	
}
