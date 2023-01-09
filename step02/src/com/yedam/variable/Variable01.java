package com.yedam.variable;

public class Variable01 { //제일 큰 영역이 클랙스 블록

	public static void main(String[] args) { //메소드 블록
		//int 는 숫자만 가능
		int hour = 3; //로컬 변수
		int minute = 5;
		//println 은 자동줄바꿈
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println(totalMinute+"분");
		
		/*
		int value; 초기화 선언을 하지 않아서 오류 뜸
		int result = value +10;
		System.out.println(result);
		*/
		
		int x = 3;
		int y = 5;
		//x -> y의 값 변경
		//y -> x의 값 변경
		//대신 담아 줄 수 있는 변수를 이용
		int z = 0;
		//x의 데이터를 미리 z에 담아 두기
		System.out.println("초기값 : x = 3 , y = 5");
		z = x;
		x = y;
		y = z;
		//z에 x를 넣고 x에 y를 넣고 y에 z를 넣으면 서로 바뀐 값을 가질 수 있다.
		System.out.println("변경값 : x = " + x + " , y = " + y);
	}
	//메소드 블록에서 선언한 변수는 블록 밖에서 사용 불가능

}
