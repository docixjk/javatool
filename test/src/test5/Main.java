package test5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * 메뉴1 주사위 크기 5~10 입력받기 (범위 벗어나면 범위안내 뜨게) 메뉴2 5가 나올 때까지 주사위를 몇번 굴리는지 구하고 출력 메뉴3
		 * 메뉴2에서 각 주사위 수별로 몇번씩 나왔는지 출력 메뉴4 메뉴2에서 가장 많이 나온 수가 몇인지 구하고 출력 메뉴5 프로그램종료
		 * 
		 */

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int diceW = 0;
		int ranNum = 0;
		int count = 0;
		int[] diceCount = null;
		// 스캐너 소환
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.print("메뉴 입력 > ");
			int menuPic = Integer.parseInt(sc.nextLine());
			
			if (menuPic == 1) {
				System.out.print("주사위 크기 > ");
				diceW = Integer.parseInt(sc.nextLine());
				if (5 <= diceW && diceW <= 10) {
					diceCount = new int[diceW];
				} else {
					System.out.println("입력 가능한 범위는 5~10 입니다.");
				}

			} else if (menuPic == 2) {
				ranNum = 0;
				while (ranNum != 5) {
					ranNum = (int) (Math.random() * diceW) + 1;
					if (ranNum != 5) {
						diceCount[ranNum-1]++;
						count++;
					} else if (ranNum == 5) {
						diceCount[ranNum-1]++;
						count++;
						System.out.println("5가 나올때 까지 " + count + " 번 굴렸습니다.");
					}
				}

			} else if (menuPic == 3) {
				// 메뉴3 메뉴2에서 각 주사위 수별로 몇번씩 나왔는지 출력
				for (int i = 0; i < diceCount.length; i++) {
					System.out.println((i + 1) + "번은 " + diceCount[i] + "나왔습니다.");
				}

			} else if (menuPic == 4) {
				// 메뉴4 메뉴2에서 가장 많이 나온 수가 몇인지 구하고 출력
				int max = diceCount[0];
				int index = 0;
				for (int i = 1; i < diceCount.length; i++) {
					if (max < diceCount[i]) {
						max = diceCount[i];
						index = i;
					}
				}
				System.out.println("가장 많이 나온 수는 " + (index + 1) + "입니다.");

			} else if (menuPic == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("없는 번호 입니다.");
			}
		}
	}

}
