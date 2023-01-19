package com.yedam.java.beginner;

import java.util.*;

public class Exp10430 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		String[] strNum = new String[3];

		while(true) {
			strNum = sc.nextLine().split(" ");
	
			a = Integer.parseInt(strNum[0]);
			b = Integer.parseInt(strNum[1]);
			c = Integer.parseInt(strNum[2]);
			
			if ((2 > a || a > 10000)||
				(2 > b || b > 10000)||
				(2 > c || c > 10000)) {
				System.out.println("2~10000 사이의 수를 입력해주세요");
			}else {
				System.out.println((a + b) % c);
				System.out.println(((a % c) + (b % c)) % c);
				System.out.println((a * b) % c);
				System.out.println(((a % c) * (b % c)) % c);
				break;
			}
		}

	}
}
