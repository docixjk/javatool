package com.yedam.java.ch02_01;

public class CarExp {

	public static void main(String[] args) {
		//���� �ϳ��� �����ؼ� ��� ����
		Car car = new Car();
		
		//�� �޸��� ����
		car.run();
		System.out.println();
		
		//Car�� �ǵ��� �ʰ� �ִ� ���
		//������ �ٲپ�� �Ҷ� �ٸ� Ŭ������ ����!
		car.flt = new Kumho();
		car.frt = new Kumho();
	
		car.run();

	}

}
