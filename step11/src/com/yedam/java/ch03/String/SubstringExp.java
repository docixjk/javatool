package com.yedam.java.ch03.String;

public class SubstringExp {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//substring(start, end) => Index start 부터 end 전까지 잘라냄
		//끝나는 인덱스 그다음을 요구한다 880815 총 0~5까지만 필요하지만 6까지 넣음
		String firstNum = ssn.substring(0, 6);
		System.out.println("생년월일 : " + firstNum);
		
		//substring(start) => Index start 부터 끝까지 잘라냄
		String secondNum = ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);
		
		// - 을 기준으로 자른다 : { "880815" , "1234567" }
		String[] numList = ssn.split("-");
		//문자열 객체를 numList 인덱스 만큼 돈다
		for(String num : numList) {
			System.out.println(num);
		}
	}

}
