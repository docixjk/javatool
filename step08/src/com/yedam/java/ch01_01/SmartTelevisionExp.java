package com.yedam.java.ch01_01;

public class SmartTelevisionExp {

	public static void main(String[] args) {
		
		SmartTelevision smTv = new SmartTelevision();
		
		smTv.turnOn();
		smTv.search("³×ÀÌ¹ö");
		smTv.setVolume(-100);
		smTv.setVolume(20);
		smTv.turnOff();

		RemoteControl rc = smTv;
		Searchable urlSh = smTv;
	}

}
