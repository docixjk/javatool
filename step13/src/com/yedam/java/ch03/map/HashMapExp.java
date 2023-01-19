package com.yedam.java.ch03.map;

import java.util.*;

public class HashMapExp {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("신용준", 90);
		map.put("권용준", 80);
		// 키 값이 중복, 그러므로 새로운 값이 들어가게 됨
		map.put("신용준", 95);

		System.out.println("총 Entry 는 " + map.size());

		System.out.println("\t신용준 : " + map.get("신용준"));
		System.out.println();

		// map에 넣은 값을 불러오기
		Set<String> keySet = map.keySet();
		for (String name : keySet) {
			int score = map.get(name);
			System.out.println("\t" + name + " : " + score);
		}

		System.out.println();
		
		map.remove("신용준");
		
		System.out.println("총 Entry 는 " + map.size());
		System.out.println();

		//Entry를 구할때 이렇게 써야함
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		//똑같은 객체를 만드는 거니 내용은 똑같이 
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println("\t" + key + " : " + value);
		}
	}

}
