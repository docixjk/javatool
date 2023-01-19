package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			num = Integer.parseInt(sc.next());
			if(1<= num || num <= 100)break;
			else System.out.println("1~100까지 입력");
		}
		//1~5까지
		for(int i=1;i<=num;i++) {
			//공백을 num-1 만큼 넣고 별찍기 별은 1개씩 늘어나기
			for(int j=num-1; j>=i;j--) System.out.print(" ");
			for(int z=1;z<=i;z++) System.out.print("*");
			System.out.println();
		}
	}

}
