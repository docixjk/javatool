package com.yedam.object;

public class Item {
	//상품명 , 가격, 제품별 가격 , 분석
	// 출력예시, "상품명 : 가격"
	// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
	//필드
	String itemName;
	int price;
	
	
	//생성자
	Item(){
		
	}
	Item(String itemName, int price){
		//상품명과 가격을 받아올거야
		this.itemName = itemName;
		this.price = price;
	}
	
	
	//메소드
	
	void getInfo() {
		System.out.println(itemName + " : " + price);
	}
	
}
