package com.yedam.java.ch02_01;

public class DriverExp {

	public static void main(String[] args) {
		// 운전자 하나 선언
		Driver d1 = new Driver();

		// 운전자가 택시를 운전할거다
		// 선언된 매개변수는 Vehicle
		d1.drive(new Taxi());

		// Vehicle과 Bus 관계가 없다
		// (Bus 클래스에 implements 를 안하면 오류 난다)
		d1.drive(new Bus());

		// 이렇게 실행이 되는 이유는
		// Vehicle과 Taxi, Bus 들이 연결이 되어 있기 때문이다
		// (관련이 있는 인터페이스라 참조가 가능)

	}

}
