package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		while (true) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());

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
