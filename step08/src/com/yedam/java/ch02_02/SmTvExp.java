package com.yedam.java.ch02_02;

public class SmTvExp {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		// RC = RemoteControl
		// SB = Searchable
		// RC SB
		// ^^ ^^
		// |___|
		// SmartTv <= SmartTelevision / 관계
				
		// 자동 타입 변환
		// RC에서 본인 것만 사용 가능 
		RemoteControl rc = tv;
		rc.turnOff();
		
		// SB에서 본인 것만 사용 가능
		Searchable sb = tv;
		sb.search("다음");
		
		// RC, SB를 모두 상속 받고 있는 SmartTv를 사용 하는거니
		// 모든 기능에 접근이 가능하다
		SmartTv smTv = tv;
		smTv.alarm("12:00");
		smTv.search("구글");
		smTv.turnOn();

	}

}
