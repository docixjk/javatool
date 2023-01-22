package com.yedam.java.beginner;

import java.util.*;

public class Exp1924 {
	//제출 완
	public static void main(String[] args) {

		// 배열 두 개를 미리 만들어준다
		// 하나는 일주일을 적음
		String[] weekName = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		// 달마다 일 수가 다르니까 정해줌 : 자바에서는 0~11까지기 때문 우리는 1~12 그레서 0번방을 안 쓰려고 0 넣음
		int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		// 확인 할 달과 일을 입력 받음
		int inputMonths = Integer.parseInt(sc.next());
		int inputDay = Integer.parseInt(sc.next());

		// 달은 1~12 일은 1~31을 벗어날 수 없다.
		if ((1 <= inputMonths && inputMonths <= 12) && (1 <= inputDay && inputDay <= 31)) {

			// 출력할 값 초기화
			int day = 0;

			// 입력 받은 달을 넣음
			for (int i = 1; i < inputMonths; i++) {
				// 해당 월까지 일 수를 더 해줌
				day += months[i];
			}

			// -1을 해주지 않으면 다른 요일이 나옴
			day += inputDay - 1;

			// day를 7로 나머지값을 구하고 구한 값으로 요일의 이름을 빼옴
			System.out.println(weekName[day % 7]);
		} else
			System.out.println("잘못된 날짜입니다.");

	}

}
