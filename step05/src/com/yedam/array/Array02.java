package com.yedam.array;

import java.util.*;

public class Array02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//국영수의 데이터를 담는 배열
		int[] point = new int[3];
		System.out.print("국어 점수 : ");
		point[0] = Integer.parseInt(sc.nextLine());
		
		System.out.print("영어 점수 : ");
		point[1] = Integer.parseInt(sc.nextLine());
		
		System.out.print("수학 점수 : ");
		point[2] = Integer.parseInt(sc.nextLine());
		
		//array.length 배열 길이
		//1. 점수 총 합
		int sum = 0;
		System.out.println("배열의 크기 : " + point.length);
		for(int i=0;i<point.length;i++) {
			sum +=point[i];
		}
		System.out.println("총 합 : " + sum);
		
		//2. 점수 평균
		double avg = sum / point.length;
		System.out.println("평 균 : " + avg);
	}

}
