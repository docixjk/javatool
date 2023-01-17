package com.yedam.java.ch01_01;

public interface RemoteControl {
	// 상수 - 초기값이 있어야함
	// 인터페이스로 만들게 된다면 무조건 상수(final)이 붙게 된다
	// (쓰지 않아도 final로 인식)
//	public static final int MAX_VALUE = 10;
	// 아래와 같음
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;

	// 인터페이스에서의 일반메소드는 default를 붙여야 사용 가능하다.
//	public default void method() {
//		System.out.println("일반 메소드");
//	}
	// 추상 메소드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

}
