package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pratica2")
public class Controller {
	@GetMapping
	public String pratica2() {
		return ("Orientação ao Futuro");
	}
	
}