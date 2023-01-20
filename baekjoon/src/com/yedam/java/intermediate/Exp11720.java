package com.yedam.java.intermediate;

import java.util.Scanner;

public class Exp11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int result =0;
		while(true) {
			n = Integer.parseInt(sc.next());
			if(1<= n &&n<=100)break;
			else System.out.println("잘못된 숫자입니다");
		}
		for (int i=0;i<n;i++) {
			int randomNum = (int)(Math.random()*n)+1;
			System.out.print(randomNum);
			result += randomNum;
		}
		System.out.println();
		System.out.println(result);
	}

}
