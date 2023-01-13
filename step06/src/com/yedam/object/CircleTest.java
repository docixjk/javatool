package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		//static = 정적 = 공유
		//클래스 파일 메모리 로딩
		//객체 생성 없이 클래스 이름으로 스태틱 필드 접근 가능
		System.out.println(Circle.pi);
		
		// 반지름이 5인 원의 면적 계산
		// Circle 객체 생성
		Circle cc = new Circle(5);
		// 반지름 5 초기화
		double ca = cc.area(5);
		// 결과 출력
		System.out.println(ca);
		
		Circle cc2 = new Circle();
	}

}
