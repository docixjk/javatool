package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp1924 {

	public static void main(String[] args) {

		String[] weekName = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);

		int inputMonths, inputDay;

		while (true) {

			inputMonths = Integer.parseInt(sc.next());
			inputDay = Integer.parseInt(sc.next());
			if ((1 <= inputMonths && inputMonths <= 12) && (1 <= inputDay && inputDay <= 31))
				break;
			else
				System.out.println("잘못된 날짜입니다.");
		}
		int day = 0;
		for (int i = 0; i < inputMonths; i++) {
			day += months[i];
		}
		day += inputDay - 1;
		System.out.println(weekName[day % 7]);

	}

}
