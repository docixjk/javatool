package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// 1~100 2의 배수 - 1
//		int i = 1;
//		while (i <= 100) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}

		// 계산기 프로그램 - 2
		// 무한 루프 조건으로 프로그램 실행
		// event , trigger 프로그램 종료 -> break
		/*
		 * boolean run = true;
		 * 
		 * Scanner sc = new Scanner(System.in); //while 문 안에 switch 문 넣어 사용 while(run) {
		 * 
		 * System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
		 * System.out.print("입력 > "); int select = Integer.parseInt(sc.nextLine());
		 * 
		 * switch(select) { case 1: System.out.println("더할 두개의 값 입력 > ");
		 * System.out.print("1 > "); int num1 = Integer.parseInt(sc.nextLine());
		 * System.out.print("2 > "); int num2 = Integer.parseInt(sc.nextLine());
		 * System.out.printf("%d + %d = %d\n" , num1 , num2, (num1+num2)); break; case
		 * 2: System.out.println("뺄 두개의 값 입력 > "); System.out.print("1 > "); int num3 =
		 * Integer.parseInt(sc.nextLine()); System.out.print("2 > "); int num4 =
		 * Integer.parseInt(sc.nextLine()); System.out.printf("%d - %d = %d\n" , num3 ,
		 * num4, (num3-num4)); break; case 3: System.out.println("곱할 두개의 값 입력 > ");
		 * System.out.print("1 > "); int num5 = Integer.parseInt(sc.nextLine());
		 * System.out.print("2 > "); int num6 = Integer.parseInt(sc.nextLine());
		 * System.out.printf("%d * %d = %d\n" , num5 , num6, (num5*num6)); break; case
		 * 4: run = false; break; v System.out.println("잘못된 번호 입니다.(1 ~ 4 번 가능)");
		 * break; }
		 * 
		 * 
		 * } System.out.println("종료가 됩니다.");
		 */
		// 게임 만들기 - 3
		// 한 판에 500원
		// 1. 가위 , 바위 , 보 게임

		Scanner sc = new Scanner(System.in);
		int money;
		System.out.println("====insert coin====");
		System.out.print("입력 > ");
		money = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		while (money >= 500 && flag) {
			System.out.println((money / 500) + " 번 남음");
			System.out.println("1. 가위 / 바위 / 보 | 2. 앞 / 뒤 맞추기 | 3. 게임종료");

			System.out.print("입력 > ");
			int gameNo = Integer.parseInt(sc.nextLine());
			switch (gameNo) {
			case 1:
				// 컴퓨터와 가위->1 , 바위->2 , 보->3
				// 이겼다 , 졌다 , 비겼다 출력 // String.equals( 내용 )
				System.out.print("가위 / 바위 / 보 중 하나 입력 > ");
				String rsp = sc.nextLine();
				int rancom = (int) (Math.random() * 3) + 1;
				//.equals() 로 입력 문자열을 확인해주는거
				if (rsp.equals("가위")) { // 1
					if (rancom == 1)
						System.out.println("비김");
					else if (rancom == 2)
						System.out.println("짐");
					else if (rancom == 3)
						System.out.println("이김");
				} else if (rsp.equals("바위")) { // 2
					if (rancom == 1)
						System.out.println("이김");
					else if (rancom == 2)
						System.out.println("비김");
					else if (rancom == 3)
						System.out.println("짐");

				} else if (rsp.equals("보")) { // 3
					if (rancom == 1)
						System.out.println("짐");
					else if (rancom == 2)
						System.out.println("이김");
					else if (rancom == 3)
						System.out.println("비김");
				}
				money -= 500;
				break;
			case 2:
				// 검퓨터와 앞 , 뒤 맞추기
				System.out.print("앞 / 뒤 중 하나 입력 > ");
				String back = sc.nextLine();
				int ramback = (int) Math.random()+1;
				if (back.equals("앞")) { // 1
					if (ramback == 1)
						System.out.println("맞춤");
					else if (ramback == 2)
						System.out.println("틀림");
				} else if (back.equals("뒤")) { // 2
					if (ramback == 1)
						System.out.println("틀림");
					else if (ramback == 2)
						System.out.println("맞음");
				}
				money -= 500;
				break;
			case 3:
				// 종료 - 투입금액 소진이 다 되었을때 , 강제종료
				flag = false;
				break;
			default:
				System.out.println("그런 게임 없음");
				break;
			}
			if (money < 500) {
				System.out.println("돈 다 떨어짐");
			}

		}
		System.out.println("겜 끝");

	}

}
