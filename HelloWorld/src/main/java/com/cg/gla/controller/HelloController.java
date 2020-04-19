package com.cg.gla.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/show")
public String display()
{
	return "<h1><b>HelloWorld";
}
	
}
