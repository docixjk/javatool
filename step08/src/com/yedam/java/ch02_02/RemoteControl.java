package com.yedam.java.ch02_02;

public interface RemoteControl {
	// ��� - �ʱⰪ�� �־����

	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;

	// �߻� �޼ҵ�
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

}
