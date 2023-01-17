package com.yedam.java.day0117_3;

public class ArcadeGame implements Keypad {

	// 필드
	private int nMode = NORMAL_MODE;

	// 생성자


	// 메소드 오버라이딩
	@Override
	public void leftUpButton() {
		// 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		// 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		// 오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
		if(nMode == 0) {
			System.out.println("캐릭터가 일반 공격");
		}else{
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		// 오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
		if(nMode == 0) {
			System.out.println("캐릭터가 HIT 공격.");
		}else{
			System.out.println("캐릭터가 Double HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		// 모드를 바꾸고 현재 모드를 출력하는 기능
		// ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
		if(nMode == 0) {
			System.out.println("NORMAL_MODE -> HARD_MODE");
			nMode = 1;
		}else{
			System.out.println("HARD_MODE -> NORMAL_MODE");
			nMode = 0;
		}
	}

}
