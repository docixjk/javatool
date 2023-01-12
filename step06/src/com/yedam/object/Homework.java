package com.yedam.object;

import java.util.*;

public class Homework {
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
		Scanner sc = new Scanner(System.in);
		int itemNum =0;
		Item[] itArr = null;
		while (true) {
			System.out.println(".....................................................");
			System.out.println(":1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료:");
			System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''");


			System.out.print("메뉴의 번호 입력 > ");
			int selNo = Integer.parseInt(sc.nextLine());

			if (selNo == 1) {
				System.out.print("상품 수 > ");
				itemNum = Integer.parseInt(sc.nextLine());

			} else if (selNo == 2) {
				itArr = new Item[itemNum];
				for(int i=0; i<itemNum;i++) {
					itArr[i] = new Item();
					System.out.print("상품명 > ");
					itArr[i].itemName = sc.nextLine();
					System.out.print("가격 > ");
					itArr[i].price = Integer.parseInt(sc.nextLine());
					
				}

			} else if (selNo == 3) {
				for(Item itc : itArr) {
					itc.getInfo();
				}

			} else if (selNo == 4) {
				//최대 가격 구하기
				int max = itArr[0].price;
				for(int i = 1; i<itArr.length;i++) {
					if( max < itArr[i].price) {
						max = itArr[i].price;
					}
				}
				// 총합 구하기 
				int total = 0;
				for(int i=0; i<itArr.length;i++) {
					total += itArr[i].price;
				}
				System.out.println("최고 가격을 뺀 총 가격은 " + (total-max) +" 입니다");

			} else if (selNo == 5) {
				System.out.println("종료");
				break;
			}
		}
	}
}
