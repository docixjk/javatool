package com.yedam.java.ch03_01;

//Ŭ���� �տ� �߻� Ŭ���� ������ abstract�� �Է��غ���
public abstract class Phone {
	//�ʵ�
	public String owner;
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ��");
	}
	public void turnOff() {
		System.out.println("�� ����");
	}
}
