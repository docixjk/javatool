package com.yedam.java.ch02_01;

public class PromotionExp {

	public static void main(String[] args) {
		
		//�������̽� A�� Ŭ���� B�� �޼ҵ带 ��� �Դ�
		D d = new D();
		System.out.println("D d = new D();");
		d.method1();
		d.method2();
		d.method3();
		System.out.println();
		
		//�������̽��� A�� �޼ҵ带 ��� �Դ�.
		System.out.println("B b = new B();");
		B b = new B();
		b.method1();
		b.method2();
		System.out.println();
		
		
		//�������̽� A���� �޼ҵ�1�ۿ� ��� �ϳ��ۿ� ȣ������ ���Ѵ�.
		System.out.println("A a = b;");
		A a = b;
		a.method1();
		System.out.println();
		
		
	}

}
