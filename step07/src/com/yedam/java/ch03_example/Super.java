package com.yedam.java.ch03_example;

public class Super extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("..�Գ� ������?");

	}

	@Override
	public void jump() {
		System.out.println("���� ���� �ٱ� ������?");

	}

	@Override
	public void turn() {
		System.out.println("ȹ ȹ ���ƹ�����");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---��~ ���� �볻 ����?~---");

	}

}
