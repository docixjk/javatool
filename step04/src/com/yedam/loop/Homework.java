package com.yedam.loop;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현하세요.
		// 각 사분면에 해당 하는 x와 y의 값은 아래를 참조하세요.
		// 제1사분면 : x>0, y>0
		// 제2사분면 : x<0, y>0
		// 제3사분면 : x<0, y<0
		// 제4사분면 : x>0, y<0
		// 문제출처, 백준(https://www.acmicpc.net/) 14681번 문제
		// 답안
//		int x =0, y=0;
//		System.out.print("정수 x = ");
//		x = Integer.parseInt(sc.next());
//		System.out.print("정수 y = ");
//		y = Integer.parseInt(sc.next());
//		
//		if(x >= 0 && y >= 0) { //x와 y가 1000 이상
//			System.out.println("사분면 번호는 1 번 입니다");
//		}else if(x >= 0 && y <= 0 ) {
//			System.out.println("사분면 번호는 4 번 입니다");
//		}else if(x <= 0 && y >= 0 ) {
//			System.out.println("사분면 번호는 2 번 입니다");
//		}else if (x <= 0 && y <= 0 ) {
//			System.out.println("사분면 번호는 3 번 입니다");
//		}

		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		// 연도 스캐너로 받아오기
		// 답안
//		System.out.print("확인할 연도를 입력해주세요 > ");
//		int year = Integer.parseInt(sc.next());
//		if (((year % 4 == 0) && (year % 100 == 1)) || (year % 400 == 0)) {
//			System.out.println(year + "년은 윤년입니다.");
//		}else {
//			System.out.println(year + "년은 윤년이 아닙니다.");
//		}

		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		// 답안
//		System.out.print("가위 바위 보 중 하나를 입력 : ");
//		String game = sc.next();
//		switch(game){
//		case "가위":
//			System.out.println("이기기 위해선 바위를 내야 합니다");
//			break;
//		case "바위":
//			System.out.println("이기기 위해선 보를 내야 합니다");
//			break;
//		case "보":
//			System.out.println("이기기 위해선 가위를 내야 합니다");
//			break;
//		default:
//			System.out.println("다른 게임을 하고 계신가요?");
//		}

		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// hint) 중첩 for문과 if문(띄어쓰기용도) 활용
		// *
		// **
		// ***
		// ****
		// *****
		// 답안
//		for (int i = 1; i <= 5; i++) { // 줄바꿈용도
//			for (int j = 5; j >= 1; j--) { // 한줄에 별 뽑아내기
//				if (i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//
//		}

		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		// 답안
//		System.out.print("몇 단 : ");
//		int m = Integer.parseInt(sc.next());
//		System.out.print("몇 번째 : ");
//		int n = Integer.parseInt(sc.next());
//		
//		//처음 수를 받아서 줄바꿈에 사용
//		for(int i = 1; i<=1;i++){
//			// 두번째 수를 받아서 몇 번째까지 출력할건지 받아야함
//			for(int j=1;j<=n;j++) {
//				System.out.printf("%d 곱하기 %d = %d 입니다.\n",m, j, m*j);
//			}
//			
//		}

	}

}
