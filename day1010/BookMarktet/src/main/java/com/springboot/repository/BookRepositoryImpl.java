package com.springboot.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.domain.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	private List<Book> listOfBooks = new ArrayList<Book>();
	public BookRepositoryImpl() {
		Book book1 = new Book();
		book1.setBookId("ISBN1234");
		book1.setName("자바스크립트 입문");
		book1.setUnitPrice(new BigDecimal(30000));
		book1.setAuthor("조현영");
		book1.setDescription("자바스크립트의 기초부터 심화까지");
		book1.setPublisher("길벗");
		book1.setCategory("IT전문서");
		book1.setUnitsInStock(new BigDecimal(1000));
		book1.setReleaseDate("2024/02/20");
		
		Book book2 = new Book();
		book2.setBookId("ISBN1235");
		book2.setName("파이썬의 정석");
		book2.setUnitPrice(new BigDecimal(29800));
		book2.setAuthor("조용주, 임좌상");
		book2.setDescription("4차 산업 혁명의 핵심인 머신러닝..");
		book2.setPublisher("길벗");
		book2.setCategory("IT교육교재");
		book2.setUnitsInStock(new BigDecimal(1000));
		book2.setReleaseDate("2023/01/10");
		
		Book book3 = new Book();
		book3.setBookId("iSBN1236");
		book3.setName("안드로이드 프로그래밍");
		book3.setUnitPrice(new BigDecimal(36000));
		book3.setAuthor("송미영");
		book3.setDescription("안드로이드의 기본 개념을 체계적으로 익히고");
		book3.setPublisher("길벗");
		book3.setCategory("IT교육교재");
		book3.setUnitsInStock(new BigDecimal(1000));
		book3.setReleaseDate("2023/06/30");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
	}

	public List<Book> getAllBookList() {
		return listOfBooks;
	}

}
