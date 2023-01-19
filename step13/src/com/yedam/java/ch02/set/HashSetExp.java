package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExp {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// 저장된 순서가 없으니까 저장된 순서로 나오는걸 보장할 수 없다.
		// 반복자에 따라 출력 됨
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");

		// 기존에 Java가 있기 때문에 들어가지는 않음
		set.add("Java");

		int size = set.size();
		System.out.println("총 객체 수는 " + size);
		System.out.println();

		// 반복자라고 불림
		Iterator<String> iterator = set.iterator();
		// 기다리는 값이 있는지 확인
		while (iterator.hasNext()) {
			// set 안에 있는 객체를 가져옴 ( 주소를 보고 값을 가져올 수 있음 )
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String skill : set) {
			System.out.println("\t"+skill);
		}
		
		System.out.println();
		
		//내부의 값들의 연결이 끊길뿐 인스턴스는 있음
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다.");
		}
		
	}

}
