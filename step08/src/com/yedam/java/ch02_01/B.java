package com.yedam.java.ch02_01;

public class B implements A {

	@Override
	public void method1() {
		//A�� ���� �� �� �ִ� B
		System.out.println("�������̽� A�� method1");
	}

	public void method2() {
		System.out.println("Ŭ���� B�� method2");
	}
}
