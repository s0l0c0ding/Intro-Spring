package com.solocoding.application.logic;

import java.util.List;

import com.solocoding.application.dto.FamousDto;

public interface FamousDtoLogic {

	/**
	 * return the richest man
	 * @return FamousDto
	 */
	FamousDto findTheRichest ();
	
	int insertFamous (FamousDto input);
	
	List<FamousDto> getAll ();
	
}
