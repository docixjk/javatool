package com.yedam.java.ch03.String;

import java.io.UnsupportedEncodingException;

public class Exp {

	public static void main(String[] args) {
		//디코딩 먼저 해보자
		//byte[] -> String
		byte[] bt1 = {72,101,108,108,111,32,74,97,118,97};
		
		//String 이라는 생성자를 통해서 들어가게 됨 숫자 -> 문자
		String str1 = new String(bt1);
		System.out.println(str1);
		
		//별도의 문자셋 ( 기준 )을 지정하는 경우
		String str = "안녕하세요";
		
		//byte는 한글의 글자당 3byte를 가진다.
		byte[] btX = str.getBytes();
		System.out.println("btX.length : " + btX.length);
		
		String strX = new String(btX);
		System.out.println("btX -> strX : " + strX);
		
		
		
		try {
			byte[] btY = str.getBytes("UTF-8");
			System.out.println("btY.length : " + btY.length);
			
			String strY = new String(btY, "EUC-KR");
			System.out.println("btY -> strY : " + strY);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
