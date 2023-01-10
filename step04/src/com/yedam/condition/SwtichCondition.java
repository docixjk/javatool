package com.yedam.condition;

import java.util.Scanner;

public class SwtichCondition {

	public static void main(String[] args) {
//		int number = (int) (Math.random() * 6) + 1;
//		switch (number) {
//		case 1:
//			System.out.println("1번");
//			break;
//		case 2:
//			System.out.println("2번");
//			break;
//		case 3:
//			System.out.println("3번");
//			break;
//		case 4:
//			System.out.println("4번");
//			break;
//		case 5:
//			System.out.println("5번");
//			break;
//		default:
//			System.out.println("6번");
//			break;
//		}
//
//		// char
//
//		char grade = 'B';
//
//		switch (grade) {
//		case 'A': {
//			System.out.println("우수 회원");
//			break;
//		}
//		case 'B': // 이런식으로도 사용한다 'b'와 'B' 모두 찾을 수 있다
//		case 'b': {
//			System.out.println("일반 회원");
//			break; // break가 없다면 밑에 것도 실행 해버림
//		}
//		default: {
//			System.out.println("손님");
//			break;
//		}
//		}
//
//		// 입력한 성적을 등급으로 환산
//		Scanner sc = new Scanner(System.in);
//
//		// import java.util.Scanner; << Scanner를 사용하기 위해 입력
//		System.out.print("입력 > ");
//		int scores = Integer.parseInt(sc.nextLine());
//		switch (scores / 10) {
//		case 10:
//		case 9: {
//			System.out.println("A 등급");
//			break;
//		}
//		case 8: {
//			System.out.println("B 등급");
//			break;
//		}
//		case 7: {
//			System.out.println("C 등급");
//			break;
//		}
//		default: {
//			System.out.println("D 등급");
//			break;
//		}
//		}
//		int no = 10;
//		//no가 2의 배수
//		if(no%2 == 0) {
//			//no가 5의 배수
//			if(no%5 == 0) {
//				//no가 10의 배수
//				if(no%10 ==0) {
//					System.out.println("no는 10의 배수");
//				}
//			}
//		}
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 > ");
		
		score = Integer.parseInt(sc.nextLine());
		
		String grade = "";
		
		if(score >= 90) {
			if(score >=95) { // 90점 이상이면서 95점 이상인 경우
				grade = "A+";
			} else {		 // 90점 이상이지만 95점 미만인 경우
				grade = "A";
			}
		}
		
		System.out.println("휙득한 학점 : " + grade);

	}

}
