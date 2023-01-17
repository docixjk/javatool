package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	// 레벨별로 요구 하는 것이 다 다름

	public abstract void run(); // 달리기

	public abstract void jump();// 점프

	public abstract void turn();// 턴

	public abstract void showLvMsg(); // 레벨 출력

	// 일반 메소드도 가질 수 있다.
	// 공통 적으로 사용 됨
	// final을 넣어준다 (상속 불가능) - 사용은 하되 덮어쓰기 불가
	public final void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
