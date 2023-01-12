package com.yedam.nayeol;

import java.util.*;

public class Enumexp {

	public static void main(String[] args) {
		//Week 타입의 today 변수
		//today는 Week가 갖고 있는 데이터만 가질 수 있다.
		//today 데이터 범위는 monday~sunday 총 7개
		Week today = null;
		
		//오늘의 요일이 어떤 요일 ? - 1
		Calendar cal = Calendar.getInstance();
		
		//일요일 = 1 로 표현 , 월요일 = 2 . . . 금요일 = 6
		//오늘 요일을 숫자로 알려줌
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘이 무슨 요일인지 갖고 옴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		
	}

}
