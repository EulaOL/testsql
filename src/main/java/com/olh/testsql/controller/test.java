package com.olh.testsql.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//测试
public class test {

	@RequestMapping("/te")
	public String hello(){
		return "te";
	}
	
}
