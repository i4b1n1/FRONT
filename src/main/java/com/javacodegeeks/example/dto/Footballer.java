package com.javacodegeeks.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Footballer {
	public Footballer(Integer id, String name, String surname, String team, String idLeague, String position,
			String penalties) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.team = team;
		this.idLeague = idLeague;
		this.position = position;
		this.penalties = penalties;
	}

	public Integer id; 
	
	public String name;
	
	public String surname;
	
	public String team;
	
	public String idLeague;
	
	public String position;
	
	public String penalties;
	
}
