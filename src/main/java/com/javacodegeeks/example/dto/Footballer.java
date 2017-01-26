package com.javacodegeeks.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Footballer {

	public Footballer(int i, String string, String string2, String string3, String string4, String string5,
			String string6) {
		// TODO Auto-generated constructor stub
	}

	public Integer id;
	
	public String name;
	
	public String surname;
	
	public String team;
	
	public String idLeague;
	
	public String position;
	
	public String penalties;
	
}
