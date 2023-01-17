package com.yedam.java.ch02_01;

public class Car {
	Tire flt = new Hankook();
	Tire frt = new Hankook();
	Tire rlt = new Hankook();
	Tire rrt = new Hankook();
	
	public void run() {
		flt.roll();
		frt.roll();
		rlt.roll();
		rrt.roll();
	}
}
