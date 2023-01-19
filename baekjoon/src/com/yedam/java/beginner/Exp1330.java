package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문자열 배열 선언 개수는 2개 : 공백을 기준으로 수 두개를 받기위해서
		String[] strNum = new String[2];

		int a, b;
		while (true) {
			// 엔터 치는 순간 공백을 기준으로 나눔
			strNum = sc.nextLine().split(" ");

			// 배열 내의 문자열을 숫자로 변환
			a = Integer.parseInt(strNum[0]);
			b = Integer.parseInt(strNum[1]);

			// x와 y는 1이상 10000이하여야함
			if ((1 <= a || a <= 10000) || (1 <= b || b <= 10000))
				break;

			// 이 외의 값이라면 범위 메세지와 다시 입력하게 해줌
			else
				System.out.println("1~10000까지의 숫자를 입력해주세요");
		}

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
