package com.yedam.java.beginner;

import java.util.*;

public class Exp10430 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		while(true) {
	
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());
			
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
