package com.yedam.java.ch02_01;

public class B implements A {

	@Override
	public void method1() {
		//A를 구현 할 수 있는 B
		System.out.println("인터페이스 A의 method1");
	}

	public void method2() {
		System.out.println("클래스 B의 method2");
	}
}
