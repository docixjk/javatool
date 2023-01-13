package com.yedam.object;

public class Student {

	// 필드 , 객체의 속성 ( 정보 , 데이터 )가 저장되는 부분
	// 이름
	String name;
	int age;
	String schoolName;
	int kor;
	int eng;
	int math;

	// 생성자 , 객체 초기화 ( 생성 )할 때 사용하는 부분
	// 기본 생성자 -> 생성하지 않아도 컴파일 ( 실행 ) 자바에서 알아서 생성.
	// 생성자 -> 매개변수 , 객체 생성 시 실행문 정의
	Student() { // 클래스명이랑 같아야 함
		// 생성자 안에 있는 실행문 부터 먼저 실행 됨
	}

	Student(String name) {
		this.name = name;
	}

	Student(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}
	//age 생성자를 호출해서 사용 하기 위해서 this()사용
	Student(String name, int age) {
		this(age);
		this.name = name;
//		this.age = age;
	}
	// 메소드 , 객체를 생성 후 기능을 사용할 때 정의하는 부분

	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 학교 : " + schoolName);
		System.out.println("학생의 국어 : " + kor);
		System.out.println("학생의 영어 : " + eng);
		System.out.println("학생의 수학 : " + math);
	}

}
