package com.yedam.java.intermediate;

import java.util.*;

public class Exp1931 {
	// 제출 완 - 한번 더 확인
	public static void main(String[] args) {
		// 활동 선택 문제(Activity Selection problem)
		// 특징 '한 사람이 하나의 활동에 대해서만 작업할 수 있다'

		// 문제 포인트 - 종료시간을 기준으로 정렬
		// 서로 겹치지 않는 활동에 대해 종료시간이 빠르면
		// 더 많은 활동을 선택할 수 있는 시간이 많아진다는 것

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// 회의 시작시간, 종료시간 두 개를 입력 받아야함
		// 이걸 2차원 배열을 이용할거임

		// 여기서 [][2]는 [0] = 시작시간 , [1] = 종료시간
		int[][] time = new int[N][2];

		for (int i = 0; i < N; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		// 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
		// sort는 배열 정렬 : time 이라는 배열을 정렬 하되 어떤 식으로 할 것이냐
		// compare(T t1, T t2) 메소드만 선언 할거야
		Arrays.sort(time, new Comparator<int[]>() {

			// 기존 메소드 오버라이딩
			@Override
			public int compare(int[] t1, int[] t2) {
				// a 회의시간과 b의 회의시간 비교해 정렬 해줄거임
				// {(x, y) such that x.equals(y)}.이런 느낌

				// 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
				if (t1[1] == t2[1]) {
					return t1[0] - t2[0];
				}

				return t1[1] - t2[1];
			}

		});

		// 가능한 회의 수
		int count = 0;

		// 이전 종료시간
		int prev_end_time = 0;

		for (int i = 0; i < N; i++) {

			// 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
			if (prev_end_time <= time[i][0]) {
				prev_end_time = time[i][1];
				count++;
			}
		}

		System.out.println(count);

	}

}
