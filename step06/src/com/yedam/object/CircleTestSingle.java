package com.yedam.object;

public class CircleTestSingle {

	public static void main(String[] args) {
		//싱글톤 소환
		CircleSingle cirSingle = CircleSingle.getInstance();
		//싱글톤 참조로 면적 구하기
		System.out.println(cirSingle.area(5));
	}

}
