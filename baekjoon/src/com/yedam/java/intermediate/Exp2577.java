package com.yedam.java.intermediate;


public class Exp2577 {
	public static void main(String[] args) {
		//자연수 3개 받을 배열 선언
		int[] num = new int[3];
		int[] count = new int[9];
		
		//곱한 값 받을 거
		int result=0;
		
		//자연수 3개 뽑기 범위는 100~1000
		for(int i=0; i<num.length;i++) {
			//랜덤메소드
			num[i] = (int)(Math.random()*900)+100;
			//바로 출력
			System.out.println(num[i]);
		}
		//곱하기
		result = (num[0] * num[1] * num[2]);
		
		//나온 결과값 문자열로 바꾸면서 자르기
		String[] strNum = Integer.toString(result).split("");
		
		//문자열 배열길이 만큼 반복문 돌면서 안에 있는 내용과 비교 후 카운트 시킴
		for(int i=0;i<strNum.length;i++) {
			switch(strNum[i]) {
			case "1":
				count[0]++;
				break;
			case "2":
				count[1]++;
				break;
			case "3":
				count[2]++;
				break;
			case "4":
				count[3]++;
				break;
			case "5":
				count[4]++;
				break;
			case "6":
				count[5]++;
				break;
			case "7":
				count[6]++;
				break;
			case "8":
				count[7]++;
				break;
			case "9":
				count[8]++;
				break;
			default:
				System.out.println("잘못된 숫자입니다.");
				break;
			}
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		
		
		
	}

}
