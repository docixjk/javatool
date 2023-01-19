package com.yedam.java.ch01_01;

//implements �ڴ� �������̽�
public class Television implements RemoteControl {

	// �ʵ�
	// �����Ǵ� �ʵ尡 �ִٸ� ���������� ������ �Ѵ�.
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV ��");

	}

	@Override
	public void turnOff() {
		System.out.println("TV ����");

	}

	@Override
	public void setVolume(int volume) {
		// �ִ� ������ TV �Ҹ� ����
		if (volume > RemoteControl.MAX_VALUE) {
			// volume �� �� ũ�ٸ� ���� �ִ� �ִ밪�� �ش�
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			// volume �� �� ������ ���� �ִ� �ּҰ��� �ش�
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			// �� ���� ���� �״�� ���� ����
			this.volume = volume;
		}
		System.out.println("���� �Ҹ� ũ�� : " + this.volume);

	}

}