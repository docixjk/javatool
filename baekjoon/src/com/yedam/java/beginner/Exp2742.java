package com.yedam.java.beginner;


import java.util.*;

public class Exp2742 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = Integer.parseInt(sc.next());
			if(0<n || n <=100000)break;
			else System.out.println("1~100000까지 입력");
		}
		for(int i=n;i>=1;i--)System.out.println(i);
		
	}

}
