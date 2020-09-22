package com.olh.testsql.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olh.testsql.dao.BookDao;
import com.olh.testsql.pojo.Book;
import com.olh.testsql.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;

	@Override
	public List<Book> findall() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public Book findbyId(Long id) {
		// TODO Auto-generated method stub
		return bookDao.findById(id);
	}
	@Override
	public Book findByName(String name) {
		// TODO Auto-generated method stub
		return bookDao.findByName(name);
	}
	@Override
	public void addbook(Book book) {
		// TODO Auto-generated method stub
		bookDao.addBook(book);
	}

	@Override
	public void deletebyId(Long id) {
		// TODO Auto-generated method stub
		bookDao.deleteById(id);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.updateBook(book);
	}

	

	//注解
/*
	@Override
	public Book findById(Long id) {
		return bookDao.findById(id);
	}
	@Override
	public boolean addBook(Book book) {
		boolean flag = false;
		try {
			bookDao.addBook(book);
			flag = true;
		} catch (Exception e) {
			System.out.println("新增失败");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateBook(Book book) {
		boolean flag = false;
		try {
			bookDao.updateBook(book);
			flag = true;
		} catch (Exception e) {
			System.out.println("修改失败");
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteBook(Long id) {
		boolean flag = false;
		try {
			bookDao.deleteBook(id);
			flag = true;
		} catch (Exception e) {
			System.out.println("删除失败");
			e.printStackTrace();
		}
		return flag;
	}
*/



}
