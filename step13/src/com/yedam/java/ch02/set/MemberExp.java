package com.yedam.java.ch02.set;

import java.util.*;

public class MemberExp {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		// new는 새로운 공간을 만드는거라는거 잊지마셈
		// 메모리주소가 실제로 비교되는 거
		set.add(new Member(1000, "다나카"));
		set.add(new Member(1000, "다나카"));

		System.out.println("총 객체 수는 " + set.size());

	}

}
