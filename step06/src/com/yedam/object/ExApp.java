package com.yedam.object;

public class ExApp {

	public static void main(String[] args) {
		
		/*  생성자 오버로딩  */
		
		// Boox 클래스 - 1
		// 책의 종류 , 가격 , 출판사 , 도서번호 의 정보
		// 정보는 원하는 방식 아무거나 활용해서 정보 입력
		// getInfo 메소드 객체가 가진 정보 출력

		// getInfo 출력 예시

		// 혼자 공부하는 자바
		// # 내용
		// 1) 종류 : 학습서
		// 2) 가격 : 24000원
		// 3) 출판사 : 한빛미디어
		// 4) 도서번호 : yedam-001

		// 다른예시

		// 이것이 리눅스다
		// # 내용
		// 1) 종류 : 학습서
		// 2) 가격 : 32000원
		// 3) 출판사 : 한빛미디어
		// 4) 도서번호 : yedam-002

		// Book 클래스를 선언 ( 매개변수를 넣어주어야 오류가 뜨지 않는다 )
		// 객체 생성때 데이터 값을 넣는 방법
		
//		Book bk1 = new Book(24000, "yedam-001");
//
//		bk1.getInfo();

		// Car 클래스 - 2
//		Car car1 = new Car();
//		System.out.println("car1.company " + car1.company);
//		System.out.println();
//
//		Car car2 = new Car("S-class");
//		System.out.println("car2.company " + car2.company);
//		System.out.println("car2.model " + car2.model);
//		System.out.println();
//
//		Car car3 = new Car("S-class", "검정");
//		System.out.println("car3.company " + car3.company);
//		System.out.println("car3.model " + car3.model);
//		System.out.println("car3.color " + car3.color);
//		System.out.println();
//
//		Car car4 = new Car("S-class", "검정",300);
//		System.out.println("car4.company " + car4.company);
//		System.out.println("car4.model " + car4.model);
//		System.out.println("car4.color " + car4.color);
//		System.out.println("car4.MaxSpeed " + car4.MaxSpeed + "km");
//		System.out.println();

		// Calculator - 3
//		Calculator ca = new Calculator();
//
//		double result = ca.sub(1, 1);
//		System.out.println(result);
//
//		ca.powerOn();
//		ca.powerOff();
//
//		int sumResult = ca.sum2(1, 2, 3, 4, 5, 6, 7, 7, 8, 89, 9, 6, 634, 5, 4, 4, 7, 568);
//		System.out.println("총 합 : " + sumResult);
//		int sumResult2 = ca.sum2(1, 2, 3, 4, 5);
//		System.out.println("총 합 : " + sumResult2);
		
////////////////////////////////////////////////////////////////////////////		
		
		/* 메소드 오버로딩 */
		//Score - 4
//		Score sc = new Score(70,80,60);
//		sc.getInfo();
		
		//MethodA - 5
		//얘네들도 전부 메소드다
//		System.out.println("A");
//		System.out.println(1);
//		System.out.println('C');
//		System.out.println(0.1);
//		System.out.println(true);
		
		

	}

}
