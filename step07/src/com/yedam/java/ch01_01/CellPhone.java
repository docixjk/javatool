package com.yedam.java.ch01_01;

public class CellPhone {
	// 필드
	String model;
	String color;

	// 생성자
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 메소드

	void powerOn() {
		System.out.println("전원을 키다");
	}

	void powerOff() {
		System.out.println("전원을 끄다");
	}
	void bell() {
		System.out.println("띠링 띠링");
	}

	void sendVoice(String msg) {
		System.out.println("본인 : " + msg);
	}

	void receiveVoice(String msg) {
		System.out.println("상대 : " + msg);
	}
}
