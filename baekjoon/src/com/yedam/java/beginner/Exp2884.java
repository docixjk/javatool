package com.yedam.java.beginner;

import java.util.*;

public class Exp2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H, M;

		while (true) {
			H = Integer.parseInt(sc.next());
			M = Integer.parseInt(sc.next());

			if ((0 <= H && H <= 23) && (0 <= M) && (M <= 59))
				break;
			else
				System.out.println("잘못된 시간입니다.");
		}

		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0)
				H = 23;
			System.out.println(H + " " + M);
		} else 
			System.out.println(H + " " + (M - 45));
	}

}
