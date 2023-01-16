package com.yedam.java.ch02_01;

public class CarExp {

	public static void main(String[] args) {
		//최소한의 수정만 통해서 정상 동작하게 하는 것이 다향성
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLT = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 금호타이어로 교체");
				car.frontRT = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 한국타이어로 교체");
				car.backLT = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.backRT = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------");
		}

	}

}
