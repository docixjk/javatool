package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinalyExp {

	public static void main(String[] args) {
		// �Ϲ� ���� -1
//		try {
//			// �����ϰ��� �ϴ� ���๮
//			Class clazz = Class.forName("java.lang.String2");
//			// Ŭ������� Ŭ������ �ִ�
//			// Ŭ���� ���� ��ü�� ��� �ִ� Ŭ����
//		} catch (ClassNotFoundException e) {
//			// �ش� ���ܰ� ���� �� ������ ���
//			// ���� ������ �����ִ� �༮
//			// �� �ڵ� ��ü�� ���ܰ� ������ ������ ��Ȯ�ؼ� �˷���
//			e.printStackTrace(); // ���� ��Ȯ�� ������ ������ �ȴ�
//
//			// �ٸ� ������� ����ϰ� ������ catch�� �ִ´�
//			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
//		}

		// ���� ���� - 2 : �ڹٿ����� ĳġ����, �����ڰ� �ľ��ؾ���
		// �̷��� �����ڰ� ���� try-catch���� �ۼ��Ѵ�.
		String data1 = null;
		String data2 = null;
		// try�� �߰�ȣ �ۿ� ���� ����Ϸ��� �ۿ��� �������ش�
		try {
			// �� ���� ���ܰ� �߻� �� �� �ִ�.
			data1 = args[0]; // 100
			data2 = args[1]; // 2oo - ���� �� ������ ó���� �ϳ��ۿ� ���� �׷��� �߰���

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.printf("%s + %s = %d\n", data1, data2, result);

			// ������ �߻� ��Ŵ
//			throw new ClassCastException();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ �� �� �����ϴ�.");
		} catch (Exception e) { // ������� Exception�� ���� ���� ���� �ȵȴ�.
			System.out.println("���������� ���� ���� �ʽ��ϴ�.");
//			return; //�޼ҵ带 ���� ��Ŵ
		} finally { //ĳġ���� ���� �ϴ� ���ο��� ������� ������ ����
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
		}
		try {
			findClass();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public static void findClass() throws NullPointerException, ClassNotFoundException {
		// �߻���Ű�� ���ܸ� throws Ű���带 �̿��� �־��ش� [ �������� ���� ]
		// �ش� �޼ҵ忡�� ���ܰ� �߻��ϴ°� ȣ�� �ϴ����� �϶�°�

		String className = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("ã���� �ϴ� Ŭ���� �̸��� �����ּ���");
		className = sc.nextLine();
		// �Է����� �ʰų� �� �����̶�� ���ܰ� �߻��ϵ��� ����
		if (className == null || className.equals("")) {
			throw new NullPointerException();
		}
		// �̶��� �������� ��
		Class clazz = Class.forName(className);

	}

}
