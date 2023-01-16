package com.yedam.java.ch01_01;

public class Car {
	// 필드
	public int speed;
	public final int maxSpeed = 500;
	
	// 생성자
	
	// 메소드
	public void speedUp() {
		speed+=1;
	}
	public final void stop() {
		System.out.println("브레이크");
		speed = 0;
		
	}
	
}
