package com.yedam.java.beginner;

import java.util.*;

public class Exp10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문자열 배열 선언 개수는 2개 : 공백을 기준으로 수 두개를 받기위해서
		String[] strNum = new String[2];
		int x, y;

		while (true) {
			//엔터 치는 순간 공백을 기준으로 나눔
			strNum = sc.nextLine().split(" ");
			
			//배열 내의 문자열을 숫자로 변환
			x = Integer.parseInt(strNum[0]);
			y = Integer.parseInt(strNum[1]);
			
			//x와 y는 1이상 10000이하여야함
			if((1<=x || x<=10000) || (1<=y || y<=10000)) break;
			
			//이 외의 값이라면 범위 메세지와 다시 입력하게 해줌
			else System.out.println("1~10000까지의 숫자를 입력해주세요");
		}
		// x크기의 배열 선언
		int[] xArr = new int[x];
		
		//배열 크기만큼 돌며 랜덤정수를 넣으면서 출력
		for(int i=0;i<xArr.length;i++) {
			xArr[i] = (int)(Math.random()*x)+1;
			System.out.print(xArr[i] + " ");
		}
		System.out.println();
		//y이하의 수만 뽑아야하니 비교문 사용
		for(int i=0;i<xArr.length;i++) {
			if(y >= xArr[i]) System.out.print(xArr[i] + " ");
		}
		

	}

}
