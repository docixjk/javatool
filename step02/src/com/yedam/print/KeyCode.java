package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws IOException {
		
		/*
		// 하나의 문자를 받아올 때 사용
		int keyCode = 0;
		
		System.out.print("입력 > "); // a 입력시
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // 97

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // 13

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode); // 10
		*/
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 > ");
		// Scanner.nextLine() => enter키 이전까지 데이터 받아 오기
		String inputDate = scanner.nextLine();
		// nextInt 와 nextLine 혼용 하지 말 것
		System.out.println("Scanner 활용 : " + inputDate);
		
		//기본 타입, == ( 1 == 1 , 1.2 == 1.3 )
		//문자열 내용 비교 equals 꼭 기억하셈
		if(inputDate.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		
	}

}
