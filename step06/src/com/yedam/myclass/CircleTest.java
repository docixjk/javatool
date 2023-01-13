package com.yedam.myclass;

import com.yedam.object.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle cc = new Circle();
		cc.setR(10);
		double area = cc.area(10);
		System.out.println(area);
	}

}
