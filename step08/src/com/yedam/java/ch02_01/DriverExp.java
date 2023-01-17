package com.yedam.java.ch02_01;

public class DriverExp {

	public static void main(String[] args) {
		// ������ �ϳ� ����
		Driver d1 = new Driver();

		// �����ڰ� �ýø� �����ҰŴ�
		// ����� �Ű������� Vehicle
		d1.drive(new Taxi());

		// Vehicle�� Bus ���谡 ����
		// (Bus Ŭ������ implements �� ���ϸ� ���� ����)
		d1.drive(new Bus());

		// �̷��� ������ �Ǵ� ������
		// Vehicle�� Taxi, Bus ���� ������ �Ǿ� �ֱ� �����̴�
		// (������ �ִ� �������̽��� ������ ����)

	}

}
