package com.yedam.java.beginner;

import java.util.*;

public class Exp2739 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 구구단 단 입력
		int n = Integer.parseInt(sc.next());

		// 1~9
		if (1 <= n && n <= 9) {

			// 1~9까지만 곱해줌
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", n, i, (n * i));
			}
		}
	}
}
