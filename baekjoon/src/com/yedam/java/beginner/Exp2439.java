package com.yedam.java.beginner;

import java.util.*;

public class Exp2439 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 별 찍을 값 입력
		int num = Integer.parseInt(sc.next());

		// 1~100까지만
		if (1 <= num && num <= 100) {
			// 길이는 num으로 정함
			for (int i = 1; i <= num; i++) {
				// 처음에는 공백의 수가 높지만 나중에는 별의 수가 높아짐
				// 한줄에 공백 찍기
				for (int j = num - 1; j >= i; j--) {
					System.out.print(" ");
				}
				// 한줄에 별 찍기
				for (int z = 1; z <= i; z++) {
					System.out.print("*");
				}

				System.out.println();
			}
		} else {
			System.out.println("1~100까지 입력");
		}
	}

}
