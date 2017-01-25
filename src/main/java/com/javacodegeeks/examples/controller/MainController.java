package com.javacodegeeks.examples.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



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

    
    @RequestMapping(value="/scoreTeam/{teamId}",method = RequestMethod.GET)
    public  Map scoreTeam(@PathVariable("teamId") String teamId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//wchodzi id-nazwa teamu, po niej szukamy wynikow
    	//dla tego team
    	map.put("Team1","2:0");
    	map.put("Team2","2:1");
    	map.put("Team3","4:5");
    	map.put("Team4","3:8");
        return map;
    }
    
    
    @RequestMapping(value="/positionTeam/{leagueId}",method = RequestMethod.GET)
    public  Map score(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"brak");
    	map.put("team1","1");
    	map.put("team2","2");
    	map.put("team3","3");
    	map.put("team4","4");
    	map.put("team5","5");
    	map.put("team6","6");
    	map.put("team7","7");
    	map.put("team8","8");
    	map.put("team9","9");
        return map;    
    }
    
    @RequestMapping(value="/scoreMatchs/{leagueId}",method = RequestMethod.GET)
    public  Map lastMatchs(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"brak");
    	map.put("team2q:team3","2:1");
    	map.put("team3w:team4","4:5");
    	map.put("team4e:team19","3:8");
    	map.put("team2w:team3","2:1");
    	map.put("team3gd:team4","4:5");
    	map.put("team42:team19","3:8");
    	map.put("team22:team3","2:1");
    	map.put("team34:team4","4:5");
    	map.put("team45:team19","3:8");
    	map.put("team26:team3","2:1");
    	map.put("team36:team4","4:5");
    	map.put("team477:team19","3:8");
        return map;    
    }
    
    @RequestMapping(value="/futureMatchs/{leagueId}",method = RequestMethod.GET)
    public  Map futureMatchs(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"28 brak");
      	map.put("team2:team3","sty");
    	map.put("team3:team4","luty");
    	map.put("team4e:team19","marz");
    	map.put("team2rr:team3","kwiec");
    	map.put("team3qw:team4","maj");
    	map.put("team42:team19","czerw");
    	map.put("team22:team3","lip");
    	map.put("team34:team4","sier");
    	map.put("team45:team19","wrz");
    	map.put("team26:team3","pazdz");
    	map.put("team36:team4","list");
    	map.put("team477:team19","grudzien");
        return map;    
    }
    
   
 
    
}
