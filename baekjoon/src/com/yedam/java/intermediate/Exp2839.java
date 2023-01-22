package com.yedam.java.intermediate;

import java.util.*;

public class Exp2839 {
	// 제출 완 - 수학적 접근이 필요함..ㅋㅋ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 몇 킬로그램 배달할지
		int N = sc.nextInt();

		// 봉지개수 = n, n/5 = / , n%5 = %
		// N | 3 4 | 5 6 7 8 9 | 10 11 12 13 14 | 15 16 17 18 19|
		// n | 1-1 | 1 2-1 2 3 | .2 .3 .4 .3 .4 | .3 .4 .5 .4 .5|
		// / | -0- | - - 1 - - | -- -- .2 -- -- | -- -- .3 -- --|
		// % | 3 4 | 0 1 2 3 4 | .0 .1 .2 .3 .4 | .0 .1 .2 .3 .4|

		if (3 <= N && N <= 5_000) {
			// 3과 5로 나눔 값이 없는 수
			if (N == 4 || N == 7) {
				System.out.println(-1);
			}
			// 5의 나눔값이 0일때
			else if (N % 5 == 0) {
				System.out.println(N / 5);
			}
			// 5의 나눔값이 1 또는 3일때
			else if (N % 5 == 1 || N % 5 == 3) {
				// 5로 나눈뒤 1 더하기
				System.out.println((N / 5) + 1);
			}
			// 5의 나눔값이 2 또는 4일때
			else if (N % 5 == 2 || N % 5 == 4) {
				// 5로 나눈뒤 2 더하기
				System.out.println((N / 5) + 2);
			}
		}
	}
}
