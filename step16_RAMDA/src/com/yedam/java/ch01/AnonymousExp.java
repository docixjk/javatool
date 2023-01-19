package com.yedam.java.ch01;

public class AnonymousExp {

	public static void main(String[] args) {
		// 익명 객체 -> 상속과 구현관계에 있는 객체를 익명으로 사용하는 것
		// 상속 -> 익명 자식 객체
		// 구현 -> 익명 구현 객체

		// 따로 클래스를 만들지 않고 바로 정의해버림 - 자기 이름이없음
		// 일시적으로 사용하는 것이 재사용을 못 함
		//test가 가리키는 인스턴스는 Phone이 아니고 새롭게 만들어진 존재임
		Phone test = new Phone() {

			@Override
			public void turnOn() {
				System.out.println("전원 키기");
			}

			@Override
			public void turnOff() {
				System.out.println("전원 끄기");
			}

			@Override
			public void service() {
				System.out.println("서비스 버전 : " + versionUpdate());
				System.out.println("서비스 시작");
			}

			double version = 1.4;

			// 구현 객체인데 실제로 사용되는 타입은 인터페이스
			// 그래서 새롭게 정의한 것은 사용 못 함
			public double versionUpdate() {
				return version + 0.1;
			}
		};
		test.turnOn();
		test.turnOff();
		test.service();
		
		// 따로 사용하려면 강제 타입 변환을 해야한다
		// 하지만 원래의 이름이 없기 때문에 못한다.
//		test.versionUpdate();


	}

}
