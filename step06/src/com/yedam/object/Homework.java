package com.yedam.object;

import java.util.*;

public class Homework {

	static Scanner sc = new Scanner(System.in);
	static int itemNum = 0;
	static Item[] itArr = null;

	// 메뉴판
	public static int selMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(":1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// 메뉴 번호 받아오기
		System.out.print("메뉴의 번호 입력 > ");
		// 숫자라서 int
		int selNo = Integer.parseInt(sc.nextLine());

		return selNo;

	}

	// 1.상품 수
	public static int itemNum() {
		// 상품 수 받는 곳 - 숫자니 int
		System.out.print("상품 수 > ");
		itemNum = Integer.parseInt(sc.nextLine());
		return itemNum;
	}

	// 2.상품 및 가격입력
	public static void itemlist() {
		// 1 에서 받은 상품 수대로 입력하기 위해서 배열 크기로 정해줌
		itArr = new Item[itemNum];
		// 배열 크기만큼 .length 상품명과 가격을 입력
		for (int i = 0; i < itemNum; i++) {
			itArr[i] = new Item();
			System.out.print("상품명 > ");
			itArr[i].itemName = sc.nextLine(); // String 이니 그대로
			System.out.print("가격 > ");
			itArr[i].price = Integer.parseInt(sc.nextLine()); // 숫자니 int
		}
	}

	public static void itemInfo() { //제품별 가격 보여주기
		// Item 클래스에서 itc 라는 객체명으로 지정함 itArr크기만큼 (인덱스 주소를 줌)
		for (Item itc : itArr) {
			// 미리 입력해둔 출력메소드를 사용
			itc.getInfo();
		}
	}

	public static void priceSum(){ // 제품 전체 가격 총 합 ,가장 비싼 제품 뺀 가격
		// 최대 가격 구하기
		int max = itArr[0].price;
		// 처음 max를 첫번째 값으로 지정해둔다
		for (int i = 1; i < itArr.length; i++) {
			// 0번 인덱스를 max에 넣었고 그 값과 1번 인덱스부터 비교를 시작
			if (max < itArr[i].price) {
				// max보다 크다면 그자리에 해당 인덱스 데이터를 집어 넣는다
				max = itArr[i].price;
			}
		}
		// 총합 구하기
		int total = 0;
		// 수를 합할 변수 초기화
		for (int i = 0; i < itArr.length; i++) {
			// itArr 길이 만큼 돌며 이때 해당 인덱스 값을 합할 변수에 더해준다
			total += itArr[i].price;
		}
		// 출력 부분은 최대값을 제외하는 것이니 총합에 최대값을 빼준다.
		System.out.println("최고 가격을 뺀 총 가격은 " + (total - max) + " 입니다");

		
	}
	
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		while (true) {
			int selNo = selMenu();

			if (selNo == 1) { // 1 입력 시 실행
				itemNum();
			} else if (selNo == 2) { // 2 입력 시 실행
				itemlist();
			} else if (selNo == 3) { // 3 입력 시 실행
				itemInfo();
			} else if (selNo == 4) { // 4 입력 시 실행
				priceSum();
			} else if (selNo == 5) { // 5 입력 시 실행
				System.out.println("종료");
				break;
			}
		}
	}
}
