package com.usluga1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controler {


	

	@RequestMapping("/get")
	public String home() {

		return "index";
	}
	


}