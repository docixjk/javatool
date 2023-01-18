package com.yedam.java.ch01;

public class ExceptionExp {

	public static void main(String[] args) {

		// NumPointerException - 1
		// 선언에 null 값을 넣었는지 확인!
//		String data = null;
//		System.out.println(data.toCharArray());
		// 오류의 메세지와 위치를 알려준다
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
		// 주로 파싱할 때 주로 사용
//		String data3 = "100";
//		String data4 = "a100";
//
//		int value3 = Integer.parseInt(data3);
//		// 메소드에 값을 주고 함수를 호출해오는데 a때문에 파싱하지 못함 
//		int value4 = Integer.parseInt(data4); //a가 있기 때문에 숫자로 변환 못함
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
		//실행 시킨다면 따로 출력이 없어 실행만 됨
		if(animal instanceof Dog) {
			//값이 true가 아니기 때문에 그냥 넘어감
			//instanceof 을 쓰지않고 선언만 한다면 오류가 뜬다.
			Dog dog = (Dog) animal;
			//animal은 Dog 타입의 변수
		}
	}
}

//확인 위해 클래스 선언
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
