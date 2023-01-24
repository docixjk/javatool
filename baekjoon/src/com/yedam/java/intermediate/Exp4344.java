package com.yedam.java.intermediate;

import java.util.*;

public class Exp4344 {
	// 제출 완 - 한번더 확인하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 개수
		int C = sc.nextInt();

		// 학생 배열 선언
		int[] stu;

		for (int i = 0; i < C; i++) {
			// 몇명의 학생의 점수 받을지

			int N = sc.nextInt();
			stu = new int[N];

			// 학생들 점수 총 합 초기화
			double sum = 0;

			// 학생들 점수 입력
			for (int j = 0; j < N; j++) {
				int score = sc.nextInt();

				// 입력 받은 값 배열에 넣기
				stu[j] = score;

				// 총 합 누적
				sum += score;
			}

			// 평균
			double avg = (sum / N);

			// 평균이상 학생
			double count = 0;

			// 평균이상 학생 찾기
			for (int j = 0; j < N; j++) {

				// 해당 인덱스값이 평균이상일때
				if (stu[j] > avg) {
					// 학생 수 더하기
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count / N) * 100);
		}
		sc.close();
	}
}
