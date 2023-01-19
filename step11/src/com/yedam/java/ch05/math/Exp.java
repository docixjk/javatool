package com.yedam.java.ch05.math;

public class Exp {

	public static void main(String[] args) {

		// abs() = 절대값 ( 음수, 양수 똑같은 값) ( 2.14 )
		System.out.println("-2.14 의 절대값 : " + Math.abs(-2.14));
		System.out.println("2.14 의 절대값 : " + Math.abs(2.14));
		System.out.println();
		
		// max() = 최대값 ( 6.7 ) , min() = 최소값 ( 3.8 )
		System.out.println("3.8 , 6.7 중 최대값 : " + Math.max(3.8, 6.7));
		System.out.println("3.8 , 6.7 중 최소값 : " + Math.min(3.8, 6.7));
		System.out.println();
		
		// ceil() = 올림값 ( 5.3 -> 6 , -5.3 -> -5 )
		System.out.println("5.3 의 올림값 : " + Math.ceil(5.3));
		System.out.println("-5.3 의 올림값 : " + Math.ceil(-5.3));
		System.out.println();
		
		// floor() = 버림값 ( 5.3 -> 5 , -5.3 -> -6 )
		System.out.println("5.3 의 버림값 : " + Math.floor(5.3));
		System.out.println("-5.3 의 버림값 : " + Math.floor(-5.3));
		System.out.println();
		
		// round() = 반올림값 5이상 ( 5.3 -> 5 , -5.3 -> -5 )
		System.out.println("5.3 의 반올림값 : " + Math.round(5.3));
		System.out.println("-5.3 의 반올림값 : " + Math.round(-5.3));
		System.out.println();
		
		// rint() = 반올림값 6이상( 5.3 ->  , -5.3 -> - )
		// 가까운 정수의 실수값
		// 앞자리가 홀수냐 짝수냐에도 차이가 있다.
		// 음수일 때는 달라진다 헷갈리지 말 것
		System.out.println("소수점 앞자리 홀 수");
		System.out.println("5.5 의 가까운 정수의 실수값 : " + Math.rint(5.5));
		System.out.println("5.6 의 가까운 정수의 실수값 : " + Math.rint(5.6));
		System.out.println("-5.4 의 가까운 정수의 실수값 : " + Math.rint(-5.4));
		System.out.println("-5.5 의 가까운 정수의 실수값 : " + Math.rint(-5.5));
		
		System.out.println("소수점 앞자리 짝 수");
		System.out.println("4.5 의 가까운 정수의 실수값 : " + Math.rint(4.5));
		System.out.println("4.6 의 가까운 정수의 실수값 : " + Math.rint(4.6));
		System.out.println("-4.5 의 가까운 정수의 실수값 : " + Math.rint(-4.5));
		System.out.println("-4.6 의 가까운 정수의 실수값 : " + Math.rint(-4.6));
		System.out.println();
		
		
		
	}

}
