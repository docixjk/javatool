package com.yedam.java.ch02;

//제네릭 타입!! <> 넣어주기
public class Box<T> {
	//< 타입 (클래스) > 을 값으로 받는 일종의 변수
	//꺽새 안에 넣은 알파벳으로 선언 가능 
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	
}
