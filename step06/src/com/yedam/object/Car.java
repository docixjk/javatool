package com.yedam.object;

public class Car {
	//필드
	String company = "벤츠";
	String model;
	String color;
	int MaxSpeed;
	
	//생성자
	Car(){
		
	}
	Car(String model){
//		this.model = model;
		this(model,"은색",250);
	}
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}
	Car(String model, String color, int MaxSpeed){
		this.model = model;
		this.color = color;
		this.MaxSpeed = MaxSpeed;
	}
	
	//메소드
	
}
