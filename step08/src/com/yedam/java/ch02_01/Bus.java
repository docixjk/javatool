package com.yedam.java.ch02_01;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 런");
		
	}
	public void checkFare() {
		System.out.println("요금을 체크");
	}

}
