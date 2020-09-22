package com.olh.testsql.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.olh.testsql.pojo.Book;

@Mapper
public interface BookDao {

	
	// 查询所有信息
	List<Book> findAll();
	//根据id查找信息
	Book findById(@Param("id")Long id);
	//根据name查找信息
	Book findByName(String name);
	//新增	
	void addBook(@Param("book")Book book);
	 
	//删除
	void deleteById(@Param("id")Long id);
	//修改
	void updateBook(@Param("book")Book book);
	
	/*
	// 查询所有信息
	@Select("select * from book")
	List<Book> findAll();
	// 查询某条信息
	@Select("select * from book where id=#{id}")
	Book findById(Long id);
    //新增
	@Insert("insert into book(name,author,description，num) values (#{name},#{author},#{description},#{num})")
	boolean addBook(Book book);
	// 修改

	@Update("update book set name=#{name},author=#{author},description=#{description},num=#{num} where id=#{id}")
	boolean updateBook(Book book); 
	// 删除

	@Delete("delete from book where id=#{id}")
	boolean deleteBook(Long id); 
*/
	

	

	
	
	
}
