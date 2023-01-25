package com.yedam.java.day0125;

import java.util.*;

public class StringB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//중복되는 문자가 몇개가 존재하는지,
		//a~z : 26개가 다 들어온다는 가정
		//0~25, 각각의 인덱스 어떤 문자를 의미
		//0 -> a, 1 -> b ... 25 -> z
		//아스키 코드 : a => 97 , b => 98 ...
		//내가 입력한 문자 - 97 = 배열의 인덱스 값
		//ary[내가 입력한 문자 - 97] => 0~25(a~z)의 자리와 개수 의미
		
		
		int[] count = new int[26];

		String str = sc.nextLine().toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			count[(int) str.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.printf("%s %d개, ",(char)(i+'a'), count[i]);
			
			} 
		}
	}

}
