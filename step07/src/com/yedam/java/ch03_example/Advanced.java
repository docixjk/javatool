package com.yedam.java.ch03_example;

public class Advanced extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("올~ 아까보단 빠르네?");

	}

	@Override
	public void jump() {
		System.out.println("올~ 점프도 해?");

	}

	@Override
	public void turn() {
		System.out.println("응~ 아직 못 돌아~");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---응~ 초보보다 쪼금 높아~---");

	}

}
