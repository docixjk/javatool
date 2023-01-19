package com.yedam.java.ch02;

public class Agency implements Rentable<Home, RentalList> {
	//인터페이스는 받아올 클래스 이름을 줘야함
	//구현 클래스 선언할때 인터페이스에서 사용할 타입의 객체를 줘야한다.

	
	//오러라이딩을 해보면 처음 주었던 알파벳이 바뀐 것을 볼 수 있다.
	@Override
	public Home rent() {
		return new Home();
	}

	@Override
	public RentalList getcount() {
		return new RentalList();
	}
}
