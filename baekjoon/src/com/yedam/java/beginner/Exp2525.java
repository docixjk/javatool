package com.yedam.java.beginner;

import java.util.Scanner;

public class Exp2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour, minute, minute2;
		while (true) {
			hour = Integer.parseInt(sc.next());
			minute = Integer.parseInt(sc.next());
			if ((0 <= hour && hour <= 23) && (0 <= minute && minute <= 59)) {
				minute2 = Integer.parseInt(sc.next());
				if (0 <= minute2 && minute2 <= 1000)
					break;
				else {
					System.out.println("잘못된 설정 시간입니다.");
				}
			} else
				System.out.println("잘못된 시간입니다.");
		}
		minute = minute + minute2;
		int num=0;
		if(minute > 59) {
			//60으로 나누고 나머지 
			num =  (int)minute / 60;
			minute = minute % 60;
			hour += num;
		}
		if(hour > 23) {
			hour = 0;
			hour = (num-1);
		}
		
		
		System.out.printf("%d %d",hour, minute);

	}

}
