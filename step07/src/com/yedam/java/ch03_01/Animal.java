package com.yedam.java.ch03_01;

public abstract class Animal {
	//�ʵ�
	public String kind; // ��
	
	//������
	
	
	//�޼ҵ�
	public void breathe() {
		System.out.println("�� ����");
	}
	//�߻� �޼ҵ� - Ŭ������ abstract �� �پ� ���� ������ ������
	//���� ��ġ�� �� - ������ �� �� �ϳ��� ���־�� ��
	// 1. �߻�Ŭ������ �����
	// 2. �޼ҵ带 �Ϲ� �޼ҵ带 �����
	public abstract void sound();
}
