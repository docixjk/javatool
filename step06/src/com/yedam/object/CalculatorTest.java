package com.yedam.object;

import java.util.Calendar;

public class CalculatorTest {

	public static void main(String[] args) {
		//싱글톤 - 이미 생성이된 객체를 참조
		CalculatorSingle calcSingle = CalculatorSingle.getInstance();
		CalculatorSingle calcSingle2 = CalculatorSingle.getInstance();
		System.out.println(calcSingle == calcSingle2);
		
		Calendar today = Calendar.getInstance();
		today.set(2023, 2, 1);
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
	}

}
