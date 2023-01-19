package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp15552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] tArr = new int[Integer.parseInt(sc.next())];

		for (int i = 0; i < tArr.length; i++) {
			int x = (int) (Math.random() * 1000) + 1;
			int y = (int) (Math.random() * 1000) + 1;
			System.out.printf("%d + %d = %d\n", x, y, (x + y));
		}

	}

}
