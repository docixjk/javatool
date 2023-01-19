package com.yedam.java.ch02;

public class MainExp {

	public static void main(String[] args) {
		// 아까 T가 어떤 타입으로 받을 건지 넣어주자
		// 지정한 타입으로만 사용 가능!!!
		Box<String> nameBox = new Box<>();

		// String 으로 적었으니 String 이외의 타입은 넣지 못한다 ( 오류뜸 )
//		nameBox.set(1000);

		nameBox.set("다나카");
		String name = nameBox.get();
		
		//Integer로 받을거니 int만 !! 입력 가능
		Box<Integer> priceBox = new Box<>();
		priceBox.set(1000);
		int price = priceBox.get();
		
		//Class로 받을거니 받을 클래스명을 넣어준다.
		Box<Apple> appleBox = new Box<Apple>();
		//셋으로 새로운 공간 생성
		appleBox.set(new Apple());
		//생성된 인스턴스를 가져온다
		Apple apple = appleBox.get();
		
		//제네릭 클래스는 인터페이스를 생성할 때도 사용가능하다
		Agency agency = new Agency();
		agency.rent().turnOnLight();
		agency.getcount().printRentDate();
	}

}
class Apple{
	
}