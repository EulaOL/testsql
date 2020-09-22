package com.olh.testsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olh.testsql.pojo.Book;
import com.olh.testsql.service.BookService;

@RestController
@CrossOrigin 
@RequestMapping(value="/api")

public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping(value = "/book")
	public List<Book> findAll() {
		System.out.println("开始查询所有信息...");
		return bookService.findall();
	}

	
	@GetMapping(value = "/book/{id}")
	public Book findById(Long id) {
		System.out.println("开始查询...");
		return bookService.findbyId(id);
	}

	@GetMapping(value = "/findbyname")
	public Book findByName(String name) {
		System.out.println("开始查询...");
		return bookService.findByName(name);
	}
	@PostMapping(value = "/book")
	public void addBook(Book book) {
		System.out.println("开始新增...");
		bookService.addbook(book);
	}

	@PutMapping(value = "/book")
	public void updateBook(Book book) {
		System.out.println("开始修改...");
		bookService.updateBook(book);
	}

	@DeleteMapping(value = "/book")
	public void deleteById(Long id) {
		System.out.println("开始删除...");
		bookService.deletebyId(id);
	}
	 
	
	/*
	  @RequestMapping(value="/book",method=RequestMethod.GET) 
	  public List<Book>findAll(){ 
		  System.out.println("开始查询所有信息..."); 
		  return bookService.findall(); 
		  }
	  
	  @RequestMapping(value="book{id}",method=RequestMethod.GET) 
	  public Book findById(@RequestParam(value = "id",required=true) Long id) {
	  System.out.println("开始查找"); 
	  return bookService.findById(id); 
	  }
	  
	  @RequestMapping(value="/book",method=RequestMethod.POST) 
	  public boolean addBook(Book book) { 
		  System.out.println("开始新增"); 
		  return bookService.addBook(book); 
		  }
	  
	  @RequestMapping(value="/book",method=RequestMethod.PUT) 
	  public boolean updateBook(Book book) {
		  System.out.println("开始更新"); 
		  return bookService.updateBook(book); 
		  }
	  
	  @RequestMapping(value="/book{id}",method=RequestMethod.DELETE) 
	  public boolean deleteBook(@RequestParam(value="id",required=true)Long id) {
	  System.out.println("开始删除"); 
	  return bookService.deleteBook(id); 
	  }
	  */
	
}
