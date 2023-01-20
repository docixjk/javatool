package com.yedam.java.beginner;

import java.util.Calendar;

public class Exp2884 {

	public static void main(String[] args) {
		// Calendar는 추상클래스라 new를 사용하지 않음 ( 싱글톤 )
		// 반환 받기위해 getInstance() 를 쓴다.
		Calendar now = Calendar.getInstance();

		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE);// 분

		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");

	}

}
