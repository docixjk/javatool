package com.yedam.java.ch03_example;

public class Player {

	private PlayerLevel lv;

	public Player() {
		lv = new Beginner();
		lv.showLvMsg();
	}

	public PlayerLevel getLv() {
		return lv;
	}

	public void upLv(PlayerLevel lv) {
		//new로 레벨 지정
		this.lv = lv;
		lv.showLvMsg();
	}

	public void play(int count) {
		//필살기 쓸 때 진행
		lv.go(count);
	}
}
/*
 * 문제) Player가 있고 이 Player가 게임을 합니다. 게임에서 Player가 가지는 레벨에 따라 할 수 있는 세가지 기능이
 * 있습니다. 바로 run(), jump(), turn()입니다. - 초보자 레벨 : 천천히 달릴(run) 수 있습니다. - 중급자 레벨 :
 * 빠르게 달리고(run) 점프할(jump) 수 있습니다. - 고급자 레벨 : 엄청 빠르게 달리고(run) 점프하고(jump) 턴할(turn)
 * 수 있습니다. 모든 레벨에서 Player가 사용할 수 있는 필살기인 go(int count)메서드를 제공합니다. go()메서드는 한번
 * run하고 매개변수로 전달된 count만큼 jump하고, 한번 turn합니다. 그 레벨에서 불가능한 기능을 요청하면 할 수 없다는 메세지를
 * 출력합니다. 출력결과) beginner : go(1), 추상 클래스 할배 advanced : go(2), 추상 클래스 아빠 super :
 * go(3) 추상 아들
 */
//초보자,중급자,고급자 모두 필살기 go() 있다
//초보자는 run만 중급자는 jump 까지 고급자는 turn까지