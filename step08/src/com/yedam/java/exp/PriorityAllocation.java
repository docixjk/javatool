package com.yedam.java.exp;

public class PriorityAllocation implements Scheduler {

	// �� ��޿� ���� ������ ����
	
	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �ɷ��� ���� �������� �켱������ ����մϴ�.");

	}

}
