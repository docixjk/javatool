package com.yedam.java.exp;

public class LeastJob implements Scheduler {

	//���� ��� ������ ���ų� ��� ��Ⱑ ���� ���� �������� ���
	
	@Override
	public void getNextCall() {
		System.out.println("��� ������ ������� ��⿭���� �����ɴϴ�");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�");

	}

}
