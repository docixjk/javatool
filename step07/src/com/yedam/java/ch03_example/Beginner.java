package com.yedam.java.ch03_example;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("��~ �� �ź���~");

	}

	@Override
	public void jump() {
		System.out.println("��~ ���� �ȵ�~");

	}

	@Override
	public void turn() {
		System.out.println("��~ �� ����~");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---��~ �� �ʺ���~---");

	}

}
