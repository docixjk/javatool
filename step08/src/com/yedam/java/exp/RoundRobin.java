package com.yedam.java.exp;

public class RoundRobin implements Scheduler {

	// ���� �� �� ���ư��� �����ϰ� ��� ���� ���
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭�� �����ɴϴ�");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");

	}

}
