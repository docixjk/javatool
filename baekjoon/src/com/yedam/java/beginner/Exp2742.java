package com.yedam.java.beginner;

import java.util.*;

public class Exp2742 {
	// 제출 완
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력 값
		int n = Integer.parseInt(sc.next());

		// 1~100000
		if (1 <= n && n <= 100_000) {

			// 입력한 수에서 내려와야 하기 때문에 변수선언에 입력값 넣고 --함
			for (int i = n; i >= 1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("1~100000까지 입력");
		}
	}
}
