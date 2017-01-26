package com.javacodegeeks.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
@Data
@AllArgsConstructor
public class Team {

	public Team(int i, String string, String string2, String string3,
			List<Footballer> listFootballer2) {
		// TODO Auto-generated constructor stub
	}

	public Integer id;
	
	public String  idLeague;
	
	public String name;
	
	public String positionInLeague;
	
	public List<Footballer> listFootballer;	
}
