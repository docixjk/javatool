package com.yedam.array;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("배열 중 값이 60인 인덱스 " + i +" 번");
			}
		}
		
		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.print("인덱스가 3이 아닌 배열 값 : ");
		for (int i = 0; i < arr1.length; i++) {
			if (i == 3) {
				continue;
			}else if(i>=0 && i<arr1.length-1){			
				System.out.printf("%d, ", arr1[i]);
			}else if(i < arr1.length) {
				System.out.printf("%d\n", arr1[i]);
			}
		}
		
		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 
		// 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번째 배열 값을 변경 할거냐? : ");
		int pick = Integer.parseInt(sc.nextLine());
		for(int i=0;i<arr1.length;i++) {
			if(i == pick) {
				System.out.print("변경할 값을 입력 : ");
				arr1[i] = Integer.parseInt(sc.nextLine());
				System.out.println("arr1["+i+"]인덱스의 변경된 값은 " + arr1[i] + " 입니다");
			}
		}
		
		// 문제4. 주어진 배열의 요소에서 최대값과 최대값의 위치값(인덱스), 
		//최대값과 최소값의 위치값(인덱스)을 구해보자.
		int max = 0;
		int max2 = 0;
		int min = arr1[0];
		int min2 = 0;
		for(int i=0;i<arr1.length;i++) {
			if (arr1[i] < min) {// 최소값 구하기
				min = arr1[i];
				min2 = i;
			} else if (arr1[i] > max) { // 최대값 구하기
				max = arr1[i];
				max2 = i;
			}
		}
		System.out.println("최대값은 " + max);
		System.out.println("최대값의 인덱스 값은 " + max2);
		System.out.println("최소값은 " + min);
		System.out.println("최대값의 인덱스 값은 " + min2);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 
		//배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] array = new int[10];
		System.out.println("10개의 양의 정수를 입력해주세요");
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"번째의 수는 ");
			array[i] = Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]%3 == 0) {
				System.out.println("3의 배수 : " + array[i]);
			}
		}
		
		

	}
}
