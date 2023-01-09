package com.yedam.variable;

public class Variable03 {

	public static void main(String[] args) {
		
		//int = 2,147,483,648 ~ 2,147,483,647
		int var1 = 0b1011;	//2진수
		int var2 = 0206;	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		//byte = -128 ~ 127
		byte bVar1 = 125;
		System.out.println("bVar1 : " + bVar1);
		/* byte bVar2 = 200; -> 127까지 담을 수 있으니 오류가 뜬다
		System.out.println("bVar2 : " + bVar2);*/
		
		//char = 하나의 문자를 저장 'A' 'B' '가' '나' 따옴표 한개만
		char c1 = 'A';		//문자
		char c2 = 65;		//10진수
		char c3 = '\u0041'; //16진수
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}
