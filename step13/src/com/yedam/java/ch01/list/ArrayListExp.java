package com.yedam.java.ch01.list;

import java.util.*;

public class ArrayListExp {
	public static void main(String[] args) {
		// list 컬렉션 배워보자 - add()는 맨뒤에 추가, get()은 꺼내쓰기
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		list.add("Java");

		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();

		// 배열은 보통 length를 주로 썼는데 여기서는ㄴ size()를 쓴다
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d : %s\n", i, list.get(i));
		}
		System.out.println();

		list.remove(2); // Database
		list.remove(2); // Servlet/JSP
		list.remove("Java");
		//remove를 쓰면 중복되는 값이 지워지기는 하나 인덱스의 값이 낮은게 지워짐
		for(String data : list) {
			System.out.println(data);
		}

	}
}
