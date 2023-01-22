package com.yedam.java.beginner;

import java.util.*;

public class Exp2525 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// A 는 시 , B 는 분
		int A = sc.nextInt();
		int B = sc.nextInt();

		// C는 요리 시간
		int C = sc.nextInt();

		// 전체 시간을 분으로 만든다
		int totalM = (60 * A) + B;

		// 전체 분에 요리 시간을 더해준다
		totalM += C;

		// 시간은 전체 분에서 60으로 나눈뒤 그 값이 24를 넘지 않게 한다
		// 24시가 되면 자동으로 0 이 들어감
		int hour = (totalM / 60) % 24;

		// 분은 전체 분에서 60으로 나누어 나머지 값을 받는다.
		int minute = totalM % 60;

		// 출력 부분
		System.out.println(hour + " " + minute);
	}

}
