package com.yedam.java.ch01_01;

public class Computer extends Calculator {
	// 메소드 오버라이딩
	@Override // 나는 오버라이딩 할거야!
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;

	}
}
