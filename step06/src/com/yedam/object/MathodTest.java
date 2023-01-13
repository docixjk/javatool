package com.yedam.object;

public class MathodTest {

	public static void main(String[] args) {
		//static 없을 때
//		StringUtil su = new StringUtil();
//
//		// 클래스 내의 메소드 호출
//		su.greet();
//
//		su.greet("GoodMorning");
//
//		// 리턴값을 보여주기 위해 변수 안에 넣어 출력해줌
//		long l = su.greetLength("GoodBoyGood");
//		System.out.println(l);
		
		
		//static으로 설정 시 클래스명으로도 가능
		StringUtil.greet();
		StringUtil.greet("hi bro");
		long length = StringUtil.greetLength("bic bro dummy");
		System.out.println(length);
		
		
	}

}
