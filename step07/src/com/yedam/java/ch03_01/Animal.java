package com.yedam.java.ch03_01;

public abstract class Animal {
	//필드
	public String kind; // 종
	
	//생성자
	
	
	//메소드
	public void breathe() {
		System.out.println("숨 쉰다");
	}
	//추상 메소드 - 클래스에 abstract 가 붙어 있지 않으면 오류남
	//오류 고치는 법 - 무조건 둘 중 하나는 해주어야 함
	// 1. 추상클래스로 만들기
	// 2. 메소드를 일반 메소드를 만들기
	public abstract void sound();
}
