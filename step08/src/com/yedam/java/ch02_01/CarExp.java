package com.yedam.java.ch02_01;

public class CarExp {

	public static void main(String[] args) {
		//변수 하나만 선언해서 사용 가능
		Car car = new Car();
		
		//차 달리고 있음
		car.run();
		System.out.println();
		
		//Car를 건들지 않고 넣는 방법
		//바퀴를 바꾸어야 할때 다른 클래스로 변경!
		car.flt = new Kumho();
		car.frt = new Kumho();
	
		car.run();

	}

}
