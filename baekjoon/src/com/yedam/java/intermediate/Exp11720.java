package com.yedam.java.intermediate;

import java.util.*;

public class Exp11720 {
	// 제출 완
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 합 변수 초기화
		int result = 0;
		
		int N = Integer.parseInt(sc.nextLine());
		
		if (1 <= N && N <= 100) {
			//한 줄 입력한 것을 ""로 자른다
			String[] str =sc.nextLine().split("");
			
			//배열 길이만큼 숫자로 변환해 총 합 구함
			for(int i=0;i<N;i++) {
				result += Integer.parseInt(str[i]);
			}
			System.out.println(result);
		}
	}
}
