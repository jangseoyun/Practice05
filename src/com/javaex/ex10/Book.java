package com.javaex.ex10;

public class Book {

	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode =1;

	// 생성자
	public Book() {
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	// 메소드 g,s
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//메소드 일반
	//대여기능 수행 
	
	public void rent() {
		System.out.println(title+"이(가) 대여됐습니다.");	
		stateCode=0;
	}
	
	public void print(String[] print) {
		String rentCode;
		if(stateCode==0) {
			rentCode = "대여중";
		}else{
			rentCode = "재고있음";
		}
		
		System.out.println(bookNo+"책 제목: "+title+", 작가: "+author+", 대여 유무: "+rentCode);
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", author=" + author + ", stateCode=" + stateCode + "]";
	}

}
