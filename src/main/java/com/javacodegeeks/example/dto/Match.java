package com.javacodegeeks.example.dto;

import java.util.List;

import lombok.Data;

@Data
public class Match {

	public Integer id;
	
	public List<Team> listTeam1;
		
	public List<Team> listTeam2;
	
	public String scoreT1;
	
	public String scoreT2;
	
	public String date;
	
	public String judge;
}
