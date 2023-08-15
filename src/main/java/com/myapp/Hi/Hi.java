package com.myapp.Hi;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping(value="/Hi")
public class Hi {
	@GetMapping(value="/display")
	public String display(){
		return "Hi";
	}
	RestTemplate rest=new RestTemplate();
	@GetMapping(value="/getHiviahello")
	public String SetHiviaHello() {
		String url="http://localhost:8080/hello/post";
		ResponseEntity<String> res=rest.exchange(url,HttpMethod.GET,null,String.class);
	    String value=res.getBody();
		return value;
	}

}
