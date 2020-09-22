package com.olh.testsql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.olh.testsql.pojo.Book;


public interface BookService {

	// 查找所有
	List<Book> findall();

	// 根据id查找信息
	Book findbyId(Long id);

	Book findByName(String name);
	// 新增
	void addbook(Book book);

	// 删除
	void deletebyId(Long id);

	// 修改
	void updateBook(Book book);
	
	

	/*
	// 查找所有
	List<Book> findall();
	// 查找一条
	Book findById(Long id);
	// 新增 
	boolean addBook(Book book); 
	//修改 
	boolean updateBook(Book book);
	//删除
	boolean deleteBook(Long id); 
	*/
	
}
