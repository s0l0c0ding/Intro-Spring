package com.solocoding.application.daoQuery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solocoding.application.entity.Famous;

@Repository
public interface FamousRepo extends JpaRepository<Famous, Long>{
	
	public Famous findByName (String name);
	
	public List<Famous> findBySurname (String surname);
}
