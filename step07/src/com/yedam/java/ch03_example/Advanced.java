package com.yedam.java.ch03_example;

public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��~ �Ʊ�� ������?");

	}

	@Override
	public void jump() {
		System.out.println("��~ ������ ��?");

	}

	@Override
	public void turn() {
		System.out.println("��~ ���� �� ����~");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---��~ �ʺ����� �ɱ� ����~---");

	}

}
