package com.yedam.java.ch01;

public class MainExp {

	public static void main(String[] args) {
		
		Box box = new Box();
		
		//가져올때는 항상 강제 타입 변환을 해야함....
		
		box.set("다나카");
		String name = (String) box.get(); // 스트링
		System.out.println(name);

		box.set(1000);
		Integer price = (Integer) box.get(); // 인티거
		System.out.println(price);

		box.set(new Apple());
		Apple apple = (Apple) box.get(); // 클래스
		System.out.println(apple);
	}

}

class Apple {
}
