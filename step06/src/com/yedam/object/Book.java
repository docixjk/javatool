package com.yedam.object;

public class Book {
	// 필드
	// 변하지 않을 값은 미리 선언 해두면 편하다
	String bookName;
	String books = "학습서";
	int bookPrice;
	String bookStore = "한빛미디어";
	String bookNumber;

	// 생성자
	// 매개 변수 정하기 ( 변하는 값을 넣어준다 )

	// 둘이 다른걸로 본다
	Book(int bookPrice, String books) {
		this.bookPrice = bookPrice;
		this.books = books;
	}

	// 매개변수의 타입에 따른 생성자 오버로딩
	Book(String bookNumber, String books) {
		this.bookNumber = bookNumber;
		this.books = books;
	}

	// 매개 변수 순서에 따른 생성자 오버로딩
	// 데이터 타입 기준으로 순서를 따진다.
	Book(String books, int bookPrice) {
		this.bookPrice = bookPrice;
		this.books = books;
	}

	// 매개 변수 갯수
	Book(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//기본생성자를 사용 하려면 무조건 만들어주어야 한다 ( 다른 생성자가 없으면 무관 )
	Book(){
		
	}

	// 메소드
	// 출력해서 보여줄 것
	void getInfo() {
		System.out.println(bookName);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + books);
		System.out.println("2) 가격 : " + bookPrice + " 원");
		System.out.println("3) 출판사 : " + bookStore);
		System.out.println("4) 도서번호 : " + bookNumber);
	}
}
