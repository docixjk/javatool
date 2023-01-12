package com.yedam.object;

public class MethodA {
	// 필드

	// 생성자

	// 메소드 오버로딩
	// return 값은 메소드 타입에 따라 달라짐
	int methodA() {
		return 0;
	}

	int methodA(int a) {
		return a;
	}

	int methodA(String a) {
		return 0;
	}

	int methodA(int a, String b) {
		return a;
	}

	int methodA(String a, int b) {
		return b;
	}

	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 작사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
