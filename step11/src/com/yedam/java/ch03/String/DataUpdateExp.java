package com.yedam.java.ch03.String;

public class DataUpdateExp {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체 지향 언엉비니다. 자바는 풍부한 API를 지원합니다.";
		//기존 문자열을 새로운 문자열에 넣으면서 기존에 데이터를 수정하는 것
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println(oldStr);
		//원본 자체는 그대로
		
		System.out.println(newStr);
		//원본을 데려와 수정하는 것
		
		StringBuilder sb = new StringBuilder();
		//정해진 공간안에서 지지고 볶음
		
		sb.append("JAVA ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//4번째 인덱스 위치에 정해진값을 넣는다
		sb.insert(4, "24");
		System.out.println(sb.toString());
		
		sb.replace(7, 14, "Book");
		System.out.println(sb.toString());
		
		//내부 버퍼에 있는게 최종 투스트링으로 바뀜
		String result = sb.toString();
		
		//0~4까지 지우기 - JAVA
		sb.delete(0, 4);
		
		System.out.println(result);
		System.out.println(sb.toString());
	
	}

}
