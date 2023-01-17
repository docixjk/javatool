package com.yedam.java.exp;

import java.util.Scanner;

public class SchedulerExp {

	public static void main(String[] args) {
		
		//Top-down - ��ü���� ���μ��� -> ���������� ��ü
		//�� ��ü���� �׸��� �׸��� ������ ��ġ�� �κ��� ���� �� �ִ�.
		
		//bottom-up
		//��ü�� ���� ����� -> ��ü���� ���μ���
		
		//���� -> ū �׸�
		
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;
		
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");
		
		
		String ch = scanner.next();
		
		//RoundRobin , LeastJob , PriorityAllocation ��� Ŭ����
		
		
		//�ڵ� Ÿ�� ��ȯ�� �Ͼ
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin();
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob();
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		//�߻��� ����� ����
		
		//�������̽��� ������� �κ��� �����Ѵ�
		//scheduler�� �������̽��� �� ��찡 ũ��
		//���� : ���� ��ȭ �޾ƿ� ����
		scheduler.getNextCall();
		
		//��� ���
		scheduler.sendCallToAgent();
	}

}
