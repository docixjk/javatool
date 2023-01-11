package com.yedam.array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열 - 1
		int[] ary;

		// 배열의 크기 (인덱스 갯수)
		int no;

		// 배열의 크기를 입력으로 받아서 배열 새로운 공간 주기
		System.out.print("배열의 크기 > ");
		no = Integer.parseInt(sc.nextLine());

		ary = new int[no];

//		System.out.println(ary.length);

		for (int i = 0; i < ary.length; i++) {
			System.out.print((i + 1) + "번째 데이터 입력 > ");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
//		for(int i=0;i<ary.length;i++) {
//			System.out.println(ary[i]);
//		}

		// 최대값 , 최소값 구하기 -2
		int max = 0;
		int min = ary[0];
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] < min) {// 최소값 구하기
				min = ary[i];
			} else if (ary[i] > max) { // 최대값 구하기
				max = ary[i];
			}
		}
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);

	}

}
