package com.yedam.java.ch01.list;

import java.util.*;
public class LinkedListExp {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		// 속도차가 나니 둘다 알아두자
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i=0; i<10000;i++) {
			arrayList.add(0,String.valueOf(i));
		}
		
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (end-start) + " ns");
		
		start = System.nanoTime();
		for(int i=0; i<10000;i++) {
			linkedList.add(0,String.valueOf(i));
		}
		
		end = System.nanoTime();
		System.out.println("linkedList 걸린 시간 : " + (end-start) + " ns");
		

	}

}
