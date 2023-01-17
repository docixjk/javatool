package com.yedam.java.ch03_example;

public class Super extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("..죤내 빠르네?");

	}

	@Override
	public void jump() {
		System.out.println("ㅁㅊ 높이 뛰기 선수냐?");

	}

	@Override
	public void turn() {
		System.out.println("획 획 돌아버리네");

	}

	@Override
	public void showLvMsg() {
		System.out.println("---응~ 레벨 쥰내 높네?~---");

	}

}
