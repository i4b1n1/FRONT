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
    
    
    @RequestMapping(value="/scoreAll/{leagueId}",method = RequestMethod.GET)
    public  Map score(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"2:0");
    	map.put("team2","2:1");
    	map.put("team3","4:5");
    	map.put("team4","3:8");
        return map;    
    }
    
    @RequestMapping(value="/lastMatchs/{leagueId}",method = RequestMethod.GET)
    public  Map lastMatchs(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"2:0");
    	map.put("team2","2:1");
    	map.put("team3","4:5");
    	map.put("team4","3:8");
        return map;    
    }
    
    @RequestMapping(value="/futureMatchs/{leagueId}",method = RequestMethod.GET)
    public  Map futureMatchs(@PathVariable("leagueId") String leagueId){

    	Map<String ,String> map= new HashMap<String,String>();
    	//sprawdzenie czy dane logowania sa poprawnw
    	map.put(leagueId,"28 list");
    	map.put("team2","24 list");
    	map.put("team3","3 mar");
    	map.put("team4","5 gr");
        return map;    
    }
    
    

    
    
 
    
}
