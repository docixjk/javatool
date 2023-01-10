package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		// for문 - 1번
//		for(int i=0;i<=100;i++) {
//			System.out.println(i);
//		}
		// 1부터 100까지 합 구하기 - 2번
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1~100 합 : " + sum);

		// 1~100 짝수 구하기 - 3번
		// 짝수의 성질 => 2로 나누었을때 0
//		for(int i=0;i<=100;i++) {
//			if(i % 2 == 0 ) {
//				System.out.println(i);
//			}
//		}

		// 입력한 수의 구구단 출력 - 4
//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단 입력 > ");
//
//		int gu = Integer.parseInt(sc.nextLine());
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(gu + " 곱하기 " + i + " = " + (gu * i));
//		}

		// 입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수 - 5
		// 스캐너 -> 데이터 입력
		// 데이터 받을 갯수 - > 5 ( 입력시 데이터 입력 횟수 )
		// 총합 : 값을 입력 받을 때마다 변수에 저장
		// 평균 : 총합 / 갯수
		// 최대값 : 입력할때마다 비교 최대값인지
		// 최소값 : 입력할때마다 비교 최소값인지
		Scanner sc = new Scanner(System.in);

		//얼마나 데이터를 입력할지
		System.out.print("데이터 받을 갯수 입력 > ");
		int num = Integer.parseInt(sc.next());
		
		//사용될 변수들 초기값 주기
		int number = 0;
		int sum = 0;
		int min = 0;
		int max = 0;
		//처음 받을 갯수를 범위로 잡아준다
		for (int i = 1; i <= num; i++) {
			//반복 될 때 마다 입력
			System.out.print("데이터 입력 > ");
			number = Integer.parseInt(sc.next());
			//젤 처음 수를 최소값에 넣어준다 비교를 위해서
			if(i==1) {
				min = number;
			}
			//최소값 구하기
			if(number < min) {
				min = number;
			} else if(number > max){ //최대값 구하기
				max = number;
			}
			//총합 구하기
			sum += number;
		}
		System.out.println("\n" + "총합은 " + sum);
		System.out.printf("평균은 %5.2f \n" , (double)(sum / num));
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);

	}

}
