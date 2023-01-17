package com.yedam.java.ch02_01;

public class Driver {
	// 해당 운전자가 운전할 수 만 있다면 운전하게 만들어라
	public void drive(Vehicle vcar) {
		// 캐스팅 괄호를 사용시 instanceof 연산자를 사용해야한다
		// 하나의 구현 클래스밖에 없더라도 사용해야한다
		if (vcar instanceof Bus) {
			// vcar이 가리키는것이 Bus인지 확인
			// 버스 클래스 선언
			Bus bus = (Bus) vcar;
			bus.checkFare();
		}
		// 운전자가 운전한다
		vcar.run();

	}
}
