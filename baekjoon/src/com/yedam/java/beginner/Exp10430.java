package com.yedam.java.beginner;

import java.util.*;

public class Exp10430 {
	// 제출 완

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());

		if ((2 <= a && a <= 10000) && (2 <= b && b <= 10000) && (2 <= c && c <= 10000)) {
			System.out.println((a + b) % c);
			System.out.println(((a % c) + (b % c)) % c);
			System.out.println((a * b) % c);
			System.out.println(((a % c) * (b % c)) % c);
		} else {
			System.out.println("2~10000 사이의 수를 입력해주세요");
		}

	}
}
