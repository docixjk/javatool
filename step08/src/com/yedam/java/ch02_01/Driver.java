package com.yedam.java.ch02_01;

public class Driver {
	// �ش� �����ڰ� ������ �� �� �ִٸ� �����ϰ� ������
	public void drive(Vehicle vcar) {
		// ĳ���� ��ȣ�� ���� instanceof �����ڸ� ����ؾ��Ѵ�
		// �ϳ��� ���� Ŭ�����ۿ� ������ ����ؾ��Ѵ�
		if (vcar instanceof Bus) {
			// vcar�� ����Ű�°��� Bus���� Ȯ��
			// ���� Ŭ���� ����
			Bus bus = (Bus) vcar;
			bus.checkFare();
		}
		// �����ڰ� �����Ѵ�
		vcar.run();

	}
}
