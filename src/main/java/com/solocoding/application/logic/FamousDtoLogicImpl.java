package com.solocoding.application.logic;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.solocoding.application.daoQuery.FamousRepo;
import com.solocoding.application.dto.FamousDto;
import com.solocoding.application.entity.Famous;

@Service
public class FamousDtoLogicImpl implements FamousDtoLogic{

	@Autowired
	FamousRepo repo;
	
	@Override
	public FamousDto findTheRichest() {
		List <Famous> entities = repo.findAll(Sort.by(Direction.DESC, "fortune"));
		return new FamousDto(entities.get(0));
	}

	@Override
	public int insertFamous(FamousDto input) {
		Famous output = new Famous();
		output.setName(input.getName());
		output.setSurname(input.getSurname());
		output.setFortune(input.getFortune());
		if (repo.save(output) != null) return 1;
		return 0;
	}

	@Override
	public List<FamousDto> getAll() {
		List <Famous> outFamous = repo.findAll();
		return outFamous.stream()
				.map(temp -> new FamousDto(temp))
				.collect(Collectors.toList());
	}

}
