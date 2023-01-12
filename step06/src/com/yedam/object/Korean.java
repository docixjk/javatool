package com.yedam.object;

public class Korean {
	// 필드 , 객체의 속성 ( 정보 , 데이터 )가 저장되는 부분
	String nation = "korea";
	String name;
	String ssn;

	// 생성자 , 객체 초기화 ( 생성 )할 때 사용하는 부분
	// 기본 생성자 -> 생성하지 않아도 컴파일 ( 실행 ) 자바에서 알아서 생성.
	// 생성자 -> 매개변수 , 객체 생성 시 실행문 정의
	Korean(String name, String ssn){ //매개변수를 이용해서 데이터를 만들거야
		//필드와 매개 변수 이름이 완전히 같을 경우 this. 를 이용 
		this.name = name;
		this.ssn = ssn;
	}
	
	
	// 메소드 , 객체를 생성 후 기능을 사용할 때 정의하는 부분
}
