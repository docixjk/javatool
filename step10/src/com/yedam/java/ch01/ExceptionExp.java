package com.yedam.java.ch01;

public class ExceptionExp {

	public static void main(String[] args) {

		// NumPointerException - 1
		// ���� null ���� �־����� Ȯ��!
//		String data = null;
//		System.out.println(data.toCharArray());
		// ������ �޼����� ��ġ�� �˷��ش�
		// Cannot invoke "String.toCharArray()" because "data" is null

		// ArrayIndexOutOfBoundException - 2
		if (args.length > 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
			// Index 0 out of bounds for length 0
		}

		// NumberFormatException - 3
		// �ַ� �Ľ��� �� �ַ� ���
//		String data3 = "100";
//		String data4 = "a100";
//
//		int value3 = Integer.parseInt(data3);
//		// �޼ҵ忡 ���� �ְ� �Լ��� ȣ���ؿ��µ� a������ �Ľ����� ���� 
//		int value4 = Integer.parseInt(data4); //a�� �ֱ� ������ ���ڷ� ��ȯ ����
//
//		int result = value3 + value4;
//		System.out.printf("%s + %s = %d\n", data3, data4, result);
		// For input string: "a100"

		// ClassCastException - 4
		changeDog(new Dog());
		changeDog(new Cat());
		// class com.yedam.java.ch01.Cat
		// cannot be cast to class com.yedam.java.ch01.Dog
		// (com.yedam.java.ch01.Cat and com.yedam.java.ch01.Dog
		// are in unnamed module of loader 'app')
		
	}

	public static void changeDog(Animal animal) {
		//���� ��Ų�ٸ� ���� ����� ���� ���ุ ��
		if(animal instanceof Dog) {
			//���� true�� �ƴϱ� ������ �׳� �Ѿ
			//instanceof �� �����ʰ� ���� �Ѵٸ� ������ ���.
			Dog dog = (Dog) animal;
			//animal�� Dog Ÿ���� ����
		}
	}
}

//Ȯ�� ���� Ŭ���� ����
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
