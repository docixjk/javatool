package com.yedam.java.ch02_01;

public class CastingExp {

	public static void main(String[] args) {
		Parent pt = new Child();
		pt.method1();
		pt.method2();
//		pt.method3(); //타입이 Parent라서 사용안됨

		System.out.println();

		// pt는 Child 인스턴스 참조
		Child cd = (Child) pt; // Child로 강제 타입 변환

		cd.method1();
		cd.method2();
		cd.method3();

		Parent pr = new Parent();

		// 왼쪽에는 불러온 인스턴스 오른쪽에는 이 타입이 맞는지 확인하기 위한것
		if (pr instanceof Child) {

			// pr이 들고 있는 인스턴스가 Child가 아니기 때문에 오류가 나온다
			// 메소드가 같더라도 속에 있는 클래스가 다르다면 아예 다른 클래스다
			Child ci = (Child) pr;
			ci.method1();
			ci.method2();
			ci.method3();
		} else {
			System.out.println("변수 pr의 인스턴스는 Child 클래스의 인스턴스가 아닙니다.");
		}
		
		//부모는 자신이 부모인지도 모른다.
	}

}
