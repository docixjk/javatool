package com.yedam.java.ch02_01;

public class DriverExp {
	// Overrid를 이용해서 부모는 그대로 두고 자식을 추가 할 수 있다.
	
	public static void main(String[] args) {
		Driver dv = new Driver();

		dv.driver(new Bus());
		dv.driver(new Vehicle());
		dv.driver(new Taxi());

	}

}
