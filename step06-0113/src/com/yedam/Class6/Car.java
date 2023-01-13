package com.yedam.Class6;

public class Car {

	private int speed;
	private int maxSpeed;
	private String model;
	
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	
	//상황에 따라서 겟터가 있을 수도 있고 셋터가 있을 수도 있다.
	public String getModel() {
		return this.model;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
