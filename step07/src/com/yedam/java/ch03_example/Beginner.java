package com.yedam.java.ch03_example;

public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("응~ 너 거북이~");

	}

	@Override
	public void jump() {
		System.out.println("응~ 점프 안돼~");

	}

	@Override
	public void turn() {
		System.out.println("응~ 못 돌아~");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---응~ 너 초보야~---");

	}

}
