package com.yedam.java.ch02_01;

public class ChildExp {

	public static void main(String[] args) {
		// 부모가 가진것 method1 , 2
		// 자식이 가진것 method2 , 3
		// method1 , 2 , 3 모두 호출 시 자식이 우선 검색 후 부모 검색
		
		// 결과는
		// Parent-method1()
		// Child-method2()
		// Child-method3()
		
		//자식 인스턴스 소환
		Child cd = new Child();

		cd.method1();
		// method2 는 부모와 자식 둘다 가지고 있지만 자식이 나옴
		cd.method2();
		cd.method3();

		System.out.println();

		//부모 인스턴스를 자식으로 소환
		Parent pt = cd;
		
		pt.method1();
		pt.method2();
		//method3는 부모에게 없는 필드라서 안나옴
//		pt.method3();
		
		//접근 방법에 따라서 호출이 되기도 안되기도 한다
		
	}

}
