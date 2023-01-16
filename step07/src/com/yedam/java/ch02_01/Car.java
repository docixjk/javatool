package com.yedam.java.ch02_01;

public class Car {
	// 필드
	// 변수의 타입은 고정 고치는 곳은 오른쪽 new연산자 뒤
	Tire frontLT = new Tire("앞왼쪽", 6);
	Tire frontRT = new Tire("앞오른쪽", 2);
	Tire backLT = new Tire("뒤왼쪽", 3);
	Tire backRT = new Tire("뒤오른쪽", 4);

	// 생성자

	// 메소드
	int run() {
		System.out.println("[]자동차 출발칸료[]");
		if (frontLT.roll() == false) {
			stop();
			return 1;
		}
		if (frontRT.roll() == false) {
			stop();
			return 2;
		}
		if (backLT.roll() == false) {
			stop();
			return 3;
		}
		if (backRT.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[]자동차 정지칸료[]");
	}
}
