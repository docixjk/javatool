package com.yedam.java.ch02;

public class Exp {

	public static void main(String[] args) {

		/* 람다식 */

		// 매개변수가 없는 경우
		Workable work = () -> {
			// 1개일때는 중괄호 생략 가능
			// 2개이상일때 - 중괄호 안에 내가 하고자 하는 실행문을 넣는다
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		};

		// 지정한 실행문이 실행됨
		work.work();

		System.out.println();

		work = () -> System.out.println("퇴근을 합니다.");
		work.work();

		System.out.println();

		// 매개변수가 있는 경우 - ( ) 안에 사용할거 입력하면 자동 매칭
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다");
			System.out.println("현재 재생되는 음악은 " + x + " 입니다.");
		};
		speak.speak("뉴진스 - 하입뽀이");

		System.out.println();

		// 매개변수가 한개 , 실행문이 한줄일 때는 이렇게 짤 수도 있다.
		// 매개변수가 하나면 중괄호 생략 가능
		speak = x -> System.out.println("다음 재생되는 음악은 " + x + " 입니다.");
		speak.speak("갓더비트 - 스트럼 업");

		System.out.println();

		// 리턴값이 있는 경우
		Calculator cal = (x, y) -> {
			int result = (int) (x + y);
			return result;
		};
		System.out.println("첫번째 방식 : " + cal.plus(5.8, 6.9));

		cal = (x, y) -> (int) (x + y);
		System.out.println("두번째 방식 : " + cal.plus(5.8, 6.9));
		

	}

}
