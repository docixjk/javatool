package com.yedam.common;

import java.util.Scanner;

import com.yedam.java.Product;

import com.yedam.java.Product;
public class ProductProgram {
	public ProductProgram() {
		// Main에 있는 new ProductProgram(){} 의 내용은 여기로 들어올거임
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		int productNum = 0;

		while (true) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(":1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료:");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.print("메뉴의 번호 입력 > ");
			
			int selNo = Integer.parseInt(sc.nextLine());

			if (selNo == 1) {
				System.out.print("상품 수 > ");
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
				
			} else if (selNo == 2) {
				for (int i = 0; i < productNum; i++) {
					System.out.print("상품명 > ");
					String name = sc.nextLine();
					System.out.print("가격 > ");
					int price = Integer.parseInt(sc.nextLine());
					Product product = new Product(name,price);
					list[i] = product;
				}
			} else if (selNo == 3) {
				
				for (Product pd : list) {
					System.out.printf("%s : %d\n",pd.getproName(),pd.getProPrice());
				}
			} else if (selNo == 4) {
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
			} else if (selNo == 5) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("메뉴에 없는 번호를 입력하셨습니다( 1 ~ 5 )");
			}

		}
	}
}
