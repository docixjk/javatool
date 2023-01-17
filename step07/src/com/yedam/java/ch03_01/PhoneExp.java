package com.yedam.java.ch03_01;

public class PhoneExp {

	public static void main(String[] args) {
		//추상 클래스로 선언해서 오류가 뜬다
//		Phone ph = new Phone("다나카");

		SmartPhone sp = new SmartPhone("홍길동");
		
//		Phone ph = new SmartPhone("홍길동");
		
		//Phone 타입, 클래스라 선언은 가능하나 new 연산자로는 호출 불가능
//		SmartPhone sp2 = (SmartPhone) new Phone("홍길동");
		
		//자식 클래스는 부모 클래스의 모든 것을 사용 할 수 있으니까 가능
		sp.turnOn();
		sp.internetSearch();
	}

}
