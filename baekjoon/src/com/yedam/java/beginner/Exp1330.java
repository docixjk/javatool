package com.yedam.java.beginner;

import java.util.*;

public class Exp1330 {
	// 제출 완
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		if ((-10_000 <= a && a <= 10_000) && (-10_000 <= b && b <= 10_000)) {
			if (a > b) {
				System.out.println(">");
			}
			else if (a < b) {
				System.out.println("<");
			}
			else {
				System.out.println("==");
			}
		}
	}
}
