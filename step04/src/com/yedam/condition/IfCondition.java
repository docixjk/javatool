package com.yedam.condition;

public class IfCondition {

	public static void main(String[] args) {
		/*
		 * 
		 * int score = 93;
		 * 
		 * if (score >= 90) { System.out.println("점수가 90 이상이고 , 등급 A"); }
		 * 
		 * // 실행문이 한 줄 일때만 사용 { } 생략 가능 if (score >= 90)
		 * System.out.println("점수가 90 이상이고 , 등급 A");
		 * 
		 * // if - else if (score >= 90) { System.out.println("점수가 90 이상입니다");
		 * System.out.println("등급 A 입니다"); } else { System.out.println("점수가 90 미만입니다");
		 * System.out.println("등급 B"); } // else - if // if문 ( 조건식을 여러 개 사용 할 때 ) score
		 * = 70; if (score >= 90) { System.out.println("등급 A"); } else if (score >= 80)
		 * { System.out.println("등급 A"); } else if (score >= 70) {
		 * System.out.println("등급 C"); } else if (score >= 60) {
		 * System.out.println("등급 D"); }
		 */

		// random 값 추출
		// Math.random() 의 기본 값은 0 ~ 0.99...
		//System.out.println(Math.random());
		// 그대로 쓰면 실수이기 때문에 (int) 를 달아준다면 정수만 나온다

		int number = (int)(Math.random() * 6) + 1;
		if(number == 1) {
			System.out.println("1번");
		} else if(number == 2) {
			System.out.println("2번");
		} else if(number == 3) {
			System.out.println("3번");
		} else if(number == 4) {
			System.out.println("4번");
		} else if(number == 5) {
			System.out.println("5번");
		} else{
			System.out.println("6번");
		}
	}

}
