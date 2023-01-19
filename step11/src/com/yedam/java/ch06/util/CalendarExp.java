package com.yedam.java.ch06.util;

import java.util.*;

public class CalendarExp {

	public static void main(String[] args) {
		// Calendar는 추상클래스라 new를 사용하지 않음 ( 싱글톤 )
		// 반환 받기위해 getInstance() 를 쓴다.
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR); // 년
		// 자바에서 월은 0~11 이라서 +1 해주어야함
		int month = now.get(Calendar.MONTH) + 1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일

		// 상수로 되어 있음
		int week = now.get(Calendar.DAY_OF_WEEK); // 일주일
		String strWeek = null;

		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "월";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "월";
			break;
		case Calendar.THURSDAY:
			strWeek = "월";
			break;
		case Calendar.FRIDAY:
			strWeek = "월";
			break;
		case Calendar.SATURDAY:
			strWeek = "월";
			break;
		default:
			strWeek = "월";
		}

		int amPm = now.get(Calendar.AM_PM);// 오전_오후
		String strAmPm = null;

		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE);// 분
		int second = now.get(Calendar.SECOND);// 초

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");

	}

}
