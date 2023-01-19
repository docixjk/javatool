package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
// Date 클래스를 사용하려면 import 해주어야함.
import java.util.Date;

public class DateExp {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//한국 시간 표기 방식으로 쉽게 하려면 ( 한글도 사용 가능 )
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(date);
		System.out.println(strNow);
	}

}
