package com.yedam.object;

public class Circle {
	//static 써서 달라지는 건 main에서 바로접근가능
	//final 변수 값은 절대 변할 수 없다.
	
	//private 는 자기 패키지에서만 사용 가능함
	static double pi = 3.14;
	private double r;

	
	//get / set 둘다 있어여 읽고 수정 조회가 된다
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle(){
		
	}
	//r 필드 초기화 생성자
	public Circle(double r){
		this.r = r;
	}
	
	public double area(double r) {
		double result = pi * r * r;
		return result;
	}
}
