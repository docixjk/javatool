package com.yedam.java.beginner;

import java.util.*;

public class Exp10818 {
	// 제출 완

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		// 입력값만큼 정수 주는거
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// 스캐너 닫기
		sc.close();

		// 배열 정렬
		Arrays.sort(arr);

		// 최소값 과 최대값 출력
		System.out.print(arr[0] + " " + arr[n - 1]);
	}

}
