package com.yedam.java.beginner;

import java.util.*;

public class Exp10430 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10430
		/*
		 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		 * 
		 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까? (2 ≤ A, B, C ≤ 10000) 세 수 A, B, C가 주어졌을 때,
		 * 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.next());
			if (2 >= arr[i] || arr[i] >= 10000) {
				System.out.println("2~10000 사이의 수를 입력해주세요");
				break;
			}
		}

	}

}
