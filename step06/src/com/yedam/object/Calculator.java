package com.yedam.object;

public class Calculator {
	// 필드

	// 생성자

	// 메소드
	// 메소드 리턴 타입이 존재할 때
	// 실행에 필요한 데이터를 외부에서 받아 저장할 목적
	int sum(int a, int b) {
		return a + b;
	}

	double sub(int a, int b) {
		return a - b;
	}

	// 매개변수의 정확한 갯수를 모를때 사용 (...를 사용해서 끝을 정해주지 않음)
	int sum2(int... values) {
		int total = 0;
		System.out.println(values); // 주소값
		for (int a : values) {
			total += a;
		}
		return total;
	}

	String result(String value) {
		String temp = "value 테스트 : " + value;
		return temp;
	}

	// 리터문이 없는 메소드 생성
	void powerOn() {
		System.out.println("키고");
	}

	void powerOff() {
		System.out.println("끄고");
	}

}
