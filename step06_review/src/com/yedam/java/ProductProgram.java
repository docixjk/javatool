package com.yedam.java;

import java.util.*;

public class ProductProgram {
	private Scanner sc = new Scanner(System.in);
	private Product[] list = null;
	
	
	public ProductProgram() {
		while(true) {
			//메뉴출력
			menuPrint();
			
			
			//메뉴선택
			int selNo = menuSelect();
			
			if(selNo == 1) {
				//상품 수 입력
				inputProductNum();
			}else if(selNo == 2) {
				//상품 및 가격 입력
				inputProductInfo();
			}else if(selNo == 3) {
				//제품별 가격 출력
				productInfoPrint();
			}else if(selNo == 4) {
				//분석(최고 가격의 제품을 뺀 가격)
				productAnalysis();
			}else if(selNo == 5) {
				//종료
				exit();
				break;
			}else {
				// 잘못된 메뉴 선택시 메세지 출력
				printError();
			}
			
			
		}
	}
	//메뉴 번호 입력 오류 출력
	private void printError() {
		System.out.println("메뉴에 없는 번호를 입력하셨습니다( 1 ~ 5 )");
		
	}

	//프로그램 종료
	private void exit() {
		System.out.println("종료");
	}

	//분석 출력
	private void productAnalysis() {
		int max = 0;
		int productIndex = 0;
		for(int i=0; i<list.length;i++) {
			Product product = list[i];
			if(max<product.getProPrice()) {
				max = product.getProPrice();
				productIndex = i;
			}
		}
		int sum = 0;
		for(int i=0;i<list.length;i++) {
			if(i ==productIndex) continue;
			Product pd = list[i];
			sum+= pd.getProPrice();
		}
		System.out.println("최고 가격은 " + list[productIndex].getproName() + " 입니다");
		System.out.println("최고 가격을 뺀 총 가격은 " + sum + " 입니다");
		
	}

	//상품명 : 상품가격 출력
	private void productInfoPrint() {
		for (Product pd : list) {
			System.out.printf("%s : %d\n",pd.getproName(),pd.getProPrice());
		}
		
	}

	//상품명 및 상품가격 입력
	private void inputProductInfo() {
		for (int i = 0; i < list.length; i++) {
			System.out.print("상품명 > ");
			String name = sc.nextLine();
			System.out.print("가격 > ");
			int price = Integer.parseInt(sc.nextLine());
			Product product = new Product(name,price);
			list[i] = product;
		}
	}


	//상품 수 입력
	private void inputProductNum() {
		System.out.print("상품 수 > ");
		int productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];
	}


	//메뉴 선택 입력
	private int menuSelect() {
		System.out.print("메뉴의 번호 입력 > ");
		return Integer.parseInt(sc.nextLine());
	}


	//메뉴 출력
	private void menuPrint() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("|1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료|");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
