package com.yedam.java.ch01_01;

public interface RemoteControl {
	// ��� - �ʱⰪ�� �־����
	// �������̽��� ����� �ȴٸ� ������ ���(final)�� �ٰ� �ȴ�
	// (���� �ʾƵ� final�� �ν�)
//	public static final int MAX_VALUE = 10;
	// �Ʒ��� ����
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;

	// �������̽������� �Ϲݸ޼ҵ�� default�� �ٿ��� ��� �����ϴ�.
//	public default void method() {
//		System.out.println("�Ϲ� �޼ҵ�");
//	}
	// �߻� �޼ҵ�
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

}
