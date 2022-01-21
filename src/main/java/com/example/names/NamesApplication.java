package com.example.names;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
public class NamesApplication {

	private ArrayList<String> names = new ArrayList<>(Arrays.asList("Hello", "Welcome"));

	public static void main(String[] args) {
		SpringApplication.run(NamesApplication.class, args);
	}

	@GetMapping("/name")
	public ArrayList<String> getWelcomeMessage(){
		return	names;
	}

	@GetMapping("/name/{name}")
	public String getNameByName(@PathVariable String name){
		return "Hello " + name;
	}

	@PostMapping("/name")
	public String addName(@RequestBody String name){
		names.add(name);
		return "name accepted";
	}
}
