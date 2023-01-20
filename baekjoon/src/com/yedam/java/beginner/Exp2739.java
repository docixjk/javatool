package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			n = Integer.parseInt(sc.next());
			if (1 <= n || n <= 9)
				break;
			else
				System.out.println("1~9까지 입력");
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, (n * i));
		}
	}

}
