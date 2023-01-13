package com.yedam.object;

public class StringUtil {

	// hello 출력 메소드 - 실행문
	static void greet() {
		System.out.println("hello");
	}

	static void greet(String str) {
		System.out.println(str);
	}

	// 입력한 타입에 따라 리턴값도 달라짐
	static long greetLength(String str) {
		// 리턴값을 저장할 변수를 선언
		long result;
		result = str.length();
		return result;
	}
}
