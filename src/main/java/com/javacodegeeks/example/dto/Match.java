package com.javacodegeeks.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Match {

	public Match(int i, Team team, Team team3, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public Integer id;
	
	public Team team1;
		
	public Team team2;
	
	public String scoreT1;
	
	public String scoreT2;
	
	public String date;
	
	public String judge;
}
