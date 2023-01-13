package com.yedam.Class5;

public class B {
	public B() {
		//다른 클래스에서 사용하기 위해서 인스턴스 불러옴
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; << 은 private 이니 다른 클래스에서 보이지 않음
		//a.뒤에 나오는 목록은 개발자가 좀 더 쉽게 코드짜게함
		
		a.method1();
		a.method2();
		//a.method3(); << 은 private 이니 다른 클래스에서 보이지 않음
	}
}
