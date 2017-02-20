package com.javacodegeeks.example.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
@Data
public class Team {



	public Team(Integer id, String idLeague, String name, String positionInLeague, List<Footballer> listFootballer) {
		super();
		this.id = id;
		this.idLeague = idLeague;
		this.name = name;
		this.positionInLeague = positionInLeague;
		this.listFootballer = listFootballer;
	}

	public Integer id;
	
	public String  idLeague;
	
	public String name;
	
	public String positionInLeague;
	
	public List<Footballer> listFootballer;	
}
