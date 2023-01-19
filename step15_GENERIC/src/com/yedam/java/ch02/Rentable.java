package com.yedam.java.ch02;

public interface Rentable<P, I> { //종류 상관없이 알파벳으로 나열
	//상수는 따로 없이 메소드만 선언하자
	
	P rent();
	I getcount();
}
