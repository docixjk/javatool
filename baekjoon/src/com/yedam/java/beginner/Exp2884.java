package com.yedam.java.beginner;

import java.util.*;

public class Exp2884 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 시와 분 입력
		int H = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		// 시 0~23 , 분 0~59
		if ((0 <= H && H <= 23) && (0 <= M) && (M <= 59)) {

			// 시간을 입력하면 45분전을 구해야함
			// 근데 분이 45 미만이면 음수가 나오기 때문에 시를 빼준다.
			if (M < 45) {
				// 시간빼기
				H--;
				// 1시간에 60분이니 60을 주고 거기에 45와 원래 분을 빼준다
				M = 60 - (45 - M);

				// 시간을 뺏을 때 음수면 23을 넣어줌
				if (H < 0) {
					H = 23;
				}
				System.out.println(H + " " + M);
			} else {
				// 분이 45이상이라면 뺼 수 있으니 그냥 입력값에서 45빼기
				System.out.println(H + " " + (M - 45));
			}

		} else {
			System.out.println("잘못된 시간입니다.");
		}

	}

}
