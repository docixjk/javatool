package com.yedam.java.ch01_01;

public class DmbCellPhoneExp {

	public static void main(String[] args) {
		//DmbCellPhone 인스턴스
		DmbCellPhone dmbCP = new DmbCellPhone("갤럭시노트","실버",18);
		
		//CellPhone의 필드
		System.out.println("모델 : " + dmbCP.model);
		System.out.println("색상 : " + dmbCP.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCP.channel);
		
		//CellPhone의 메소드
		dmbCP.powerOn();
		dmbCP.bell();
		dmbCP.sendVoice("모시모시");
		dmbCP.receiveVoice("마 누꼬 ?");
		
		//DmbCellPhone의 메소드
		dmbCP.turnOnDmb();
		
	}

}
