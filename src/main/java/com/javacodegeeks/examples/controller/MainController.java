package com.javacodegeeks.examples.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacodegeeks.example.dto.Footballer;
import com.javacodegeeks.example.dto.Match;
import com.javacodegeeks.example.dto.Team;



@RestController
public class MainController {

	Log log = LogFactory.getLog(MainController.class);
	
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homePage(){
        return "index";
    }
    
    @RequestMapping(value="/logging/{login}/{key}",method = RequestMethod.GET)
    public  Map logging(@PathVariable("login")   String login,@PathVariable("key") String key){
    	
    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw, jesli tak to true
    	log.info("\n login: "+login+" key: "+key);
    	map.put("status","true");
        return map;
    }

    
//    @RequestMapping(value="/scoreTeam/{teamId}",method = RequestMethod.GET)
//    public  Match scoreTeam(@PathVariable("teamId") String teamId){
//    
//    	List<Team> listTeam= new ArrayList<Team>();
//    	List<Footballer> listFootballer = new ArrayList<Footballer>();
//    	listFootballer.set(0, new Footballer(0,"name0","surname1","team1","0","bramkarz","brak"));
//    	listFootballer.set(1, new Footballer(1,"name1","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(2, new Footballer(2,"name2","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(3, new Footballer(3,"name3","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(4, new Footballer(4,"name4","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(5, new Footballer(5,"name5","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(6, new Footballer(6,"name6","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(7, new Footballer(7,"name7","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(8, new Footballer(8,"name7","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(9, new Footballer(9,"name9","surname1","team1","0","gracz","brak"));
//    	
//    	listTeam.set(0, new Team(0,"1","team1","2",listFootballer));
//    	listTeam.set(0, new Team(1,"1","team2","1",listFootballer));
//    	listTeam.set(0, new Team(2,"1","team3","3",listFootballer));
//    	listTeam.set(0, new Team(3,"2","team4","2",listFootballer));
//    	listTeam.set(0, new Team(4,"2","team5","1",listFootballer));
//    	listTeam.set(0, new Team(5,"3","team6","1",listFootballer));
//    	listTeam.set(0, new Team(6,"3","team7","2",listFootballer));
//
//    	Match match = new Match(0,listTeam.get(0),listTeam.get(1),"2","4","wtorek pietnastego","karzel");
//    	
//    	return match;
//    }
    
    //pozycja zespolu w lidze
//    @RequestMapping(value="/positionTeam/{leagueId}",method = RequestMethod.GET)
//    public  Map score(@PathVariable("leagueId") String leagueId){
//
//    	List<Team> listTeam= new ArrayList<Team>();
//    	List<Footballer> listFootballer = new ArrayList<Footballer>();
//    	listFootballer.set(0, new Footballer(0,"name0","surname1","team1","0","bramkarz","brak"));
//    	listFootballer.set(1, new Footballer(1,"name1","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(2, new Footballer(2,"name2","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(3, new Footballer(3,"name3","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(4, new Footballer(4,"name4","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(5, new Footballer(5,"name5","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(6, new Footballer(6,"name6","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(7, new Footballer(7,"name7","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(8, new Footballer(8,"name7","surname1","team1","0","gracz","brak"));
//    	listFootballer.set(9, new Footballer(9,"name9","surname1","team1","0","gracz","brak"));
//    	
//    	listTeam.set(0, new Team(0,"1","team1","2",listFootballer));
//    	listTeam.set(0, new Team(1,"1","team2","1",listFootballer));
//    	listTeam.set(0, new Team(2,"1","team3","3",listFootballer));
//    	listTeam.set(0, new Team(3,"2","team4","2",listFootballer));
//    	listTeam.set(0, new Team(4,"2","team5","1",listFootballer));
//    	listTeam.set(0, new Team(5,"3","team6","1",listFootballer));
//    	listTeam.set(0, new Team(6,"3","team7","2",listFootballer));
//
//    	Match match = new Match(0,listTeam.get(0),listTeam.get(1),"2","4","wtorek pietnastego","karzel");
//    	
//    	return match;    
//    }
    //wynik meczy w lidze
    @RequestMapping(value="/scoreMatchs/{leagueId}",method = RequestMethod.GET)
    public  List<Match> lastMatchs(@PathVariable("leagueId") String leagueId){

    	List<Team> listTeam= new ArrayList<Team>();
    	List<Footballer> listFootballer = new ArrayList<Footballer>();
    	listFootballer.add( new Footballer(0,leagueId,leagueId,leagueId,"0",leagueId,leagueId));
    	listFootballer.add( new Footballer(1,"name1","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(2,"name2","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(3,"name3","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(4,"name4","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(5,"name5","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(6,"name6","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(7,"name7","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(8,"name7","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(9,"name9","surname1","team1","0","gracz","brak"));
    	
    	listTeam.add( new Team(0,"1","team1","2",listFootballer));
    	listTeam.add( new Team(1,"1","team2","1",listFootballer));
    	listTeam.add( new Team(2,"1","team3","3",listFootballer));
    	listTeam.add( new Team(3,"2","team4","2",listFootballer));
    	listTeam.add( new Team(4,"2","team5","1",listFootballer));
    	listTeam.add( new Team(5,"3","team6","1",listFootballer));
    	listTeam.add( new Team(6,"3","team7","2",listFootballer));

    	List<Match> listMatch =  new ArrayList<Match>();
    	listMatch.add(new Match(0,listTeam.get(1),listTeam.get(2),"2","43-","wtor-",leagueId));
    	listMatch.add(new Match(1,listTeam.get(2),listTeam.get(3),"1","47","pon",leagueId));
    	listMatch.add(new Match(2,listTeam.get(3),listTeam.get(4),"25","44","srodk",leagueId));
    	listMatch.add(new Match(3,listTeam.get(4),listTeam.get(5),"26","49","wtor",leagueId));
    	listMatch.add(new Match(4,listTeam.get(5),listTeam.get(6),"21","45","pzsz","karzel7"));
    	
    	return listMatch;    
    }
    //data przyszlych meczy
    @RequestMapping(value="/futureMatchs/{leagueId}",method = RequestMethod.GET)
    public  List<Match> futureMatchs(@PathVariable("leagueId") String leagueId){

    	List<Team> listTeam= new ArrayList<Team>();
    	List<Footballer> listFootballer = new ArrayList<Footballer>();
    	listFootballer.add( new Footballer(0,leagueId,leagueId,leagueId,"0",leagueId,leagueId));
    	listFootballer.add( new Footballer(1,"name1","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(2,"name2","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(3,"name3","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(4,"name4","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(5,"name5","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(6,"name6","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(7,"name7","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(8,"name7","surname1","team1","0","gracz","brak"));
    	listFootballer.add( new Footballer(9,"name9","surname1","team1","0","gracz","brak"));
    	
    	listTeam.add( new Team(0,"1",leagueId,"2",listFootballer));
    	listTeam.add( new Team(1,"1",leagueId,"1",listFootballer));
    	listTeam.add( new Team(2,"1",leagueId,"3",listFootballer));
    	listTeam.add( new Team(3,"2",leagueId,"2",listFootballer));
    	listTeam.add( new Team(4,"2",leagueId,"1",listFootballer));
    	listTeam.add( new Team(5,"3",leagueId,"1",listFootballer));
    	listTeam.add( new Team(6,"3",leagueId,"2",listFootballer));

    	List<Match> listMatch =  new ArrayList<Match>();
    	
    	listMatch.add(new Match(0,listTeam.get(1),listTeam.get(2),"2","43-","wtor-",leagueId));
    	listMatch.add(new Match(1,listTeam.get(2),listTeam.get(3),"1","47","pon",leagueId));
    	listMatch.add(new Match(2,listTeam.get(3),listTeam.get(4),"25","44","srodk",leagueId));
    	listMatch.add(new Match(3,listTeam.get(4),listTeam.get(5),"26","49","wtor",leagueId));
    	listMatch.add(new Match(4,listTeam.get(5),listTeam.get(6),"21","45","pzsz",leagueId));
    	
    	return listMatch;    
    }
    
   
 
    
}
