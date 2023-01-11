package com.yedam.loop;

import java.util.*;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("올바른 월을 입력 하쇼[1~12]");
			month = sc.nextInt();
		}while(month < 1 || month > 12);
		System.out.println("사용자가 입력한 월은 " + month);
		

	}

}
