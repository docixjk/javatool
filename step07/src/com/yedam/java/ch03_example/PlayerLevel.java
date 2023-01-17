package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	// �������� �䱸 �ϴ� ���� �� �ٸ�

	public abstract void run(); // �޸���

	public abstract void jump();// ����

	public abstract void turn();// ��

	public abstract void showLvMsg(); // ���� ���

	// �Ϲ� �޼ҵ嵵 ���� �� �ִ�.
	// ���� ������ ��� ��
	// final�� �־��ش� (��� �Ұ���) - ����� �ϵ� ����� �Ұ�
	public final void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
