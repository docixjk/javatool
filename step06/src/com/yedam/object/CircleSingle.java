package com.yedam.object;

public class CircleSingle {
	//싱글톤
	//생성된 객체 주소를 보냄
	static CircleSingle instance = new CircleSingle();
	
	//static - 다른 곳에서 불러 쓸 수 있게 함
	//CircleSingle instance에 CircleSingle()의 객체를 넣어준다. 한번만 해두면 계속 사용가능
	
	
	//참조할 수 있는 메소드
	static CircleSingle getInstance() {
		return instance;
	}
	
	
	
	//static 써서 달라지는 건 main에서 바로접근가능
	//final 변수 값은 절대 변할 수 없다.
	static final double pi = 3.14;
	double r;

	CircleSingle(){
		
	}
	//r 필드 초기화 생성자
	CircleSingle(double r){
		this.r = r;
	}
	
	double area(double r) {
		double result = pi * r * r;
		return result;
	}
}
