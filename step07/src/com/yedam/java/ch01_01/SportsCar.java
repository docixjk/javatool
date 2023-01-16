package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	public void carStop() {
		//final이 붙으면 수정 불가능
		super.stop();
		this.maxSpeed = 400;
	}
}