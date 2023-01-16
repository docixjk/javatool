package com.yedam.java.ch01_01;

// 자식 클래스 extends 부모 클래스 - 상속 표기방법
public class DmbCellPhone extends CellPhone {
	// 필드
	String model;
	int channel;

	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
		// 상속을 받은 것은 내 것 처럼 사용 가능 - 상속 관계 중 자식클래스의 혜택
		// 만약 부모 클래스에 해당 생성자가 있다면 super 를 사용해준다
		// 같은 필드가 있으면 겹치지 않기 위해서 사용
		// super() = 부모 호출 ( 부모가 먼저니까 부모 생성자를 먼저 호출 )
		super(model, color);

		// this를 사용하면 어떤 인스턴스던 본인이라고 생각함
		// 아래가 실행이 가능 했던건 기본생성자 만 있었기 때문에
//		this.model = model;
//		this.color = color;
		this.channel = channel;
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB  방송 수신 시작");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
}
