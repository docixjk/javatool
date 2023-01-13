package com.yedam.Class6;

import com.yedam.Class5.A;

public class C {
	public C() {
		// 다른 클래스에서 사용하기 위해서 인스턴스 불러옴
		A a = new A();

		a.field1 = 1;
//		a.field2 = 1; << default 라서 다른 패키지에는 안보임
		// a.field3 = 1; << 은 private 이니 다른 클래스에서 보이지 않음

		a.method1();
//		a.method2(); << default 라서 다른 패키지에는 안보임
		// a.method3(); << 은 private 이니 다른 클래스에서 보이지 않음
	}
}
