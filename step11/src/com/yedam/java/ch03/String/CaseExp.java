package com.yedam.java.ch03.String;

public class CaseExp {

	public final static String DATA = "HELLO WORLD!";

	public static void main(String[] args) {
		// 사용자가 입력한 것
		String inputData = "Hello World!";

		String newinputDataL = inputData.toLowerCase(); // 소문자
		String newinputDataU = inputData.toUpperCase(); // 대문자

		// 문장을 비교할 때, 대소문자 구분 중요!!!
		// 비교를 하려면 똑같은 상태로 비교해야함
		if (newinputDataU.equals(DATA.toUpperCase())) {
			System.out.println("있는 데이터 잆니다.");
		} else {
			System.out.println("없는 데이터 잆니다.");
		}
		// 대소문자 구분없이 의미만 비교하는 메소드
		if (inputData.equalsIgnoreCase(DATA)) {
			System.out.println("있는 데이터 잆니다.");
		} else {
			System.out.println("없는 데이터 잆니다.");
		}
	}

}
