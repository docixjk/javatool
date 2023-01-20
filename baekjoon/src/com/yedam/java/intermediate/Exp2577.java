package com.yedam.java.intermediate;


public class Exp2577 {
//https://www.acmicpc.net/problem/2577
	public static void main(String[] args) {
		int[] num = new int[3];
		int[] arr = new int[9];
		int result=0;
		
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.random()*900)+100;
			System.out.println(num[i]);
		}
		result = num[0] * num[1] * num[2];
		System.out.println(result);
		
		
		
		
		
	}

}
