package com.javaex.ex10;

public class Book {

	/*
	Book(int bookNo, String title, String author);
	rent() : void;
	print() : void;
	 */
    
//	필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1; //대여상태 호출시 기본값 
//	private int book;
	
//	생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	
	
//	메서드 gs 

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

	
	
//	메서드 일반

	public void rent() {
		this.stateCode = 0;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	
	
//	public static void rent(Book[] books, int num) {
//		books[num-1].stateCode = 0;
//		System.out.println(books[num-1].title+"이(가) 대여 됐습니다.");
//	} 렌트2
	
	
	public void print() {
		System.out.print(bookNo+" 책 제목: "+title+", 작가: "+author+", 대여 유무: ");
		if (stateCode==1) {
			System.out.println("재고있음");
		} else {
			System.out.println("책없음");
		}
	}

    
}