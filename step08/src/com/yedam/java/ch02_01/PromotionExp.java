package com.yedam.java.ch02_01;

public class PromotionExp {

	public static void main(String[] args) {
		
		//인터페이스 A와 클래스 B의 메소드를 들고 왔다
		D d = new D();
		System.out.println("D d = new D();");
		d.method1();
		d.method2();
		d.method3();
		System.out.println();
		
		//인터페이스의 A의 메소드를 들고 왔다.
		System.out.println("B b = new B();");
		B b = new B();
		b.method1();
		b.method2();
		System.out.println();
		
		
		//인터페이스 A에는 메소드1밖에 없어서 하나밖에 호출하지 못한다.
		System.out.println("A a = b;");
		A a = b;
		a.method1();
		System.out.println();
		
		
	}

}
