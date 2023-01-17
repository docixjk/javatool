package com.yedam.java.ch03_01;

//클래스 앞에 추상 클래스 선언인 abstract를 입력해보자
public abstract class Phone {
	//필드
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	//메소드
	public void turnOn() {
		System.out.println("폰 온");
	}
	public void turnOff() {
		System.out.println("폰 오프");
	}
}
