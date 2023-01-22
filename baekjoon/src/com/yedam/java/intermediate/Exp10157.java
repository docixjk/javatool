package com.yedam.java.intermediate;

import java.util.*;

public class Exp10157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		if ((5 <= a && a <= 1_000) && (5 <= b && b <= 1_000)) {
			if (1 <= x && x <= 100_000_000) {
				int[][] arrArr = new int[a][b];

				for (int i = b; i >= 1; i--) {
					for (int j = 1; j <= a; j++) {
						System.out.printf("(%d,%d)", j, i);
					}
					System.out.println();
				}
			}
		}
	}
}
