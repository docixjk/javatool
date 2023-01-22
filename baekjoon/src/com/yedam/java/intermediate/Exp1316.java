package com.yedam.java.intermediate;

import java.util.*;

public class Exp1316 {
	// 제출 완 - 한번 더 확인하자
	// 전역 변수로 선언
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// 그룹 단어 카운트
		int count = 0;

		// 몇 개의 단어를 받을지
		int N = sc.nextInt();

		// 문자 중복 체크 함수 선언 후 사용
		for (int i = 0; i < N; i++) {
			// boolean 은 ture 와 false 만 준다
			if (check() == true) {
				// 체크값이 true면 카운트
				count++;
			}
		}
		// 총 몇개의 중복단어가 있는가
		System.out.println(count);
	}

	// 전역 함수로 boolean 타입 함수 선언
	public static boolean check() {

		// boolean 타입 배열 선언 ( 중복 체크용 )
		boolean[] check = new boolean[26];

		// 문자 중복 확인 시 중요한 변수
		int prev = 0;

		// 문자열 받아오기
		String str = sc.next();

		// 입력한 문자열 길이만큼 돌면서 charAt으로 하나씩 빼옴
		for (int i = 0; i < str.length(); i++) {

			// i 번째 문자 저장 (현재 문자)
			int now = str.charAt(i);

			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if (prev != now) {

				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if (check[now - 'a'] == false) {
					// true 로 바꿔준다
					check[now - 'a'] = true;
					// 다음 턴을 위해 prev 도 바꿔준다
					prev = now;
				}

				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
				else {
					return false; // 함수 종료
				}
			}
		}
		return true;
	}
}
