package com.yedam.java.ch03_01;

public class PhoneExp {

	public static void main(String[] args) {
		//�߻� Ŭ������ �����ؼ� ������ ���
//		Phone ph = new Phone("�ٳ�ī");

		SmartPhone sp = new SmartPhone("ȫ�浿");
		
//		Phone ph = new SmartPhone("ȫ�浿");
		
		//Phone Ÿ��, Ŭ������ ������ �����ϳ� new �����ڷδ� ȣ�� �Ұ���
//		SmartPhone sp2 = (SmartPhone) new Phone("ȫ�浿");
		
		//�ڽ� Ŭ������ �θ� Ŭ������ ��� ���� ��� �� �� �����ϱ� ����
		sp.turnOn();
		sp.internetSearch();
	}

}
