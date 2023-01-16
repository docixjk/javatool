package com.yedam.java;

public class Product {
	// 상품의 정보를 담는 클래스
	
	// 필드 - 해당 클래스가 가지는 모든 정보
	private String proName;	// 상품명
	private int proPrice;	//상품가격

	// 생성자 - (중요)( 인스턴스를 생성 )할 때 필요한 프로세스를 담고 있다
	//만약 생성자를 넣지 않고 해도 자동적으로 기본 생성자가 만들어진다
	public Product() {}
	
	//문자열 하나와 정수 하나가 필요하다
	public Product(String proName, int proPrice) {
		//스태틱은 인스턴스가 없어도 접근 가능
		//this = 인스턴스 (new 연산자가 있어야 가능)
		this.proName = proName;
		this.proPrice = proPrice;
	}

	// 메소드 - 해당 클래스가 가지는 모든 기능
	//필드는 소문자로 시작 그리고 무조건 뒷 단어는 대문자
	//세터
	public void setProName(String proName) {
		this.proName = proName;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	
	//게터
	public String getproName() {
		return this.proName;
	}
	public int getProPrice() {
		return this.proPrice;
	}
}
