package com.yedam.java.intermediate;

import java.util.*;

public class Exp10809 {
	// 제출 완
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 알파벳 수를 배열에 넣음
		int[] atoz = new int[26];

		// 포함되지 않은 알파벳은 -1로 표기 해야 하므로 배열 전체를 -1로 초기화
		for (int i = 0; i < atoz.length; i++) {
			atoz[i] = -1;
		}

		// 엔터치기 전까지 입력 값 ( 문자열 )
		String S = sc.nextLine();

		// 알파벳을 찾아야 함
		// charAt() 메소드를 이용
		// └ String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환

		// 입력한 문자열 길이만큼 반복
		for (int i = 0; i < S.length(); i++) {
			// charAt()으로 하나씩 빼오는거
			char c = S.charAt(i);

			// 만약 그 값이 -1 이면 초기화 할거임
			if (atoz[c - 'a'] == -1) {
				// c-'a' 인 이유는 시작이 0부터라서
				// baekjoon 을 예시로 든다면 b가 문장 젤 앞이니 0번 시작
				// 'a' = 97 아무거나 빼주면 된다 나는 'a'로 뺌
				// 현재 c는 아스키 코드이므로 아스키 코드로 빼줘야 함
				// c가 a라고 'a'로 빼면 0이 되는거
				// 그럼 그 자리는 초기화 되면서 0부터 들어감
				atoz[c - 'a'] = i;
			}
		}

		for (int result : atoz) {
			System.out.print(result + " ");
		}

	}

}
