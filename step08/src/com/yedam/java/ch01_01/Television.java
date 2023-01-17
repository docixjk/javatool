package com.yedam.java.ch01_01;

//implements 뒤는 인터페이스
public class Television implements RemoteControl {

	// 필드
	// 변동되는 필드가 있다면 개별적으로 가져야 한다.
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 온");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 오프");

	}

	@Override
	public void setVolume(int volume) {
		// 주는 값으로 TV 소리 조절
		if (volume > RemoteControl.MAX_VALUE) {
			// volume 이 더 크다면 갖고 있던 최대값을 준다
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			// volume 이 더 작으면 갖고 있던 최소값을 준다
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			// 그 외의 값은 그대로 갖고 간다
			this.volume = volume;
		}
		System.out.println("현재 소리 크기 : " + this.volume);

	}

}
