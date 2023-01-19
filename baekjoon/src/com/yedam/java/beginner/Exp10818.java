package com.yedam.java.beginner;

import java.util.*;

public class Exp10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (true) {
			num = Integer.parseInt(sc.next());
			if (1 <= num || num <= 1000000) break;
			else System.out.println("1~1000000까지의 수만 입력됩니다");
		}
		
		int[] numArr = new int[num];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) ((Math.random() * 2000000) - 1000000);
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i] +" ");
		}
		System.out.println();
		int max = numArr[0];
		int min = numArr[0];

		for (int i = 1; i < numArr.length; i++) {
			if(max < numArr[i]) max = numArr[i];
			else if(min > numArr[i]) min = numArr[i];
		}
		System.out.println(min + " " + max);

	}

}
