package com.olh.testsql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("{com.olh.testsql.dao}")
public class TestsqlApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(TestsqlApplication.class, args);
		System.out.println("success...");
	}

}
