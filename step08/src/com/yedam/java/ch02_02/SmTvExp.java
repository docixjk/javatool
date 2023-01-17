package com.yedam.java.ch02_02;

public class SmTvExp {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		// RC = RemoteControl
		// SB = Searchable
		// RC SB
		// ^^ ^^
		// |___|
		// SmartTv <= SmartTelevision / ����
				
		// �ڵ� Ÿ�� ��ȯ
		// RC���� ���� �͸� ��� ���� 
		RemoteControl rc = tv;
		rc.turnOff();
		
		// SB���� ���� �͸� ��� ����
		Searchable sb = tv;
		sb.search("����");
		
		// RC, SB�� ��� ��� �ް� �ִ� SmartTv�� ��� �ϴ°Ŵ�
		// ��� ��ɿ� ������ �����ϴ�
		SmartTv smTv = tv;
		smTv.alarm("12:00");
		smTv.search("����");
		smTv.turnOn();

	}

}
