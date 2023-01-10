package com.yedam.operator;

public class Opertor {

	public static void main(String[] args) {
		//++num , num++
		//증감 연산자
		int num = 0;
		System.out.println(num++); // 0 = 나중에 연산 ( 실행문 실행 후 )
		System.out.println(++num); // 2 = 연산을 먼저 ( 실행문 실행 전 )
		
		System.out.println(num--); // 2
		System.out.println(--num); // 0
		
		//논리 부정 연산자 ! = not
		//boolean은 true 또는 false 만 가질 수 있다
		boolean play = true;
		
		System.out.println(play);			//true
		play = !play;
		System.out.println(play);			//false
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);	//true
		System.out.println(result1);
		boolean result2 = (num1 != num2);	//false
		System.out.println(result2);
		boolean result3 = (num1 <= num2);	//true
		System.out.println(result3);
		
		char char1 = 'A';	//65
		char char2 = 'B';	//66
		
		boolean result4 = (char1 < char2);	//true
		System.out.println(result4);
		
		//논리 연산자 = && , || , !
		char charCode = 'A'; //65
		
		// A 보다 크고 Z보다 작다
		if( charCode >=65 && charCode <= 90 ) {
			System.out.println("대문자입니다.");
		}
		if( charCode >=97 && charCode <= 122 ) {
			System.out.println("소문자입니다.");
		}
		// '0' = 48 , '9' = 57
		// < + not(!) -> >=
		// 50 초과의 부정은 -> 50 이하
		// 초과 -> 이하 , 미만 -> 이상
		if( !(charCode < 48) && !(charCode > 57) ) {
			//charCOde >= 48 && charCode <=57
			System.out.println("숫자입니다.");
		}
		
		//복합 대입 연산자
		int result = 0;
		result += 10; // result = result + 10;
		System.out.println("result += " + result);
		
		result -= 5; // result = result - 5;
		System.out.println("result -= " + result);
		
		//삼항 연산자
		int score = 80;
		String grade = score >= 80 ? "pass" : "fail";
		System.out.println(grade);
		
		
	}

}
