package com.yedam.array;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		//한 학생의 성적을 입력.
		Scanner sc = new Scanner(System.in);
		
		//Integer.parseInt(sc.nextLine());
		int subNum = 0;
		int[] scores = null;
		int sum = 0;
		while(true) {
			System.out.println("=================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("=================================================");
			System.out.print("메뉴 입력 : ");
			int selNo = Integer.parseInt(sc.nextLine());
			
			if (selNo == 1) {
				System.out.print("1. 과목수가 몇개 입니까 : ");
				int count = Integer.parseInt(sc.nextLine());
				scores = new int[count];
				
			}else if(selNo == 2) {
				// 점수 입력하기
				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번째 점수 입력 > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selNo == 3) {
				// scores 배열 보여주기
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 점수 : " + scores[i]);
				}
			}else if(selNo == 4) {
				//총 합 , 평 균
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("점수의 총 합은 " + sum + " 입니다");
				System.out.println("점수의 평 균은 " + (sum/scores.length) + "입니다");
			}else if(selNo == 5) {
				System.out.println("끝");
				break;
			}else {
				System.out.println("목록에 없는 번호입니다.");
			}
			
			
		}

	}

}
