package com.yedam.java.intermediate;

import java.util.*;

public class Exp2577 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//1~9 나온 수 카운트
		int[] count = new int[10];
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A * B * C;
		
		
		//나온 결과값 문자열로 바꾸면서 자르기
		String[] strNum = Integer.toString(result).split("");
		
		//문자열 배열길이 만큼 반복문 돌면서 안에 있는 내용과 비교 후 카운트 시킴
		for(int i=0;i<strNum.length;i++) {
			switch(strNum[i]) {
			case "0":
				count[0]++;
				break;
			case "1":
				count[1]++;
				break;
			case "2":
				count[2]++;
				break;
			case "3":
				count[3]++;
				break;
			case "4":
				count[4]++;
				break;
			case "5":
				count[5]++;
				break;
			case "6":
				count[6]++;
				break;
			case "7":
				count[7]++;
				break;
			case "8":
				count[8]++;
				break;
			case "9":
				count[9]++;
				break;
			default:
				break;
			}
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		
		
		
	}

}
