package com.yedam.java.intermediate;

import java.util.*;

public class Exp1316 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num = Integer.parseInt(sc.nextLine());
		
		String[] str = null;
		
		int count = 0;
		
		String newStr = "";
		
		Outter:for(int i=0;i<num;i++) {
			str=sc.nextLine().split("");
			
			newStr = str[0];
			for(int j=1;j<str.length;j++) {
				if(!(str[j].equals(str[j-1]))) {
					newStr += str[j];
				}
			}
			String[] arr = newStr.split("");
			for(int j=0;j<arr.length;j++) {
				if(newStr.indexOf(arr[j]) != j) {
					continue Outter;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}
