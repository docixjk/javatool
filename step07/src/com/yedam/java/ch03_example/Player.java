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
		//new�� ���� ����
		this.lv = lv;
		lv.showLvMsg();
	}

	public void play(int count) {
		//�ʻ�� �� �� ����
		lv.go(count);
	}
}
/*
 * ����) Player�� �ְ� �� Player�� ������ �մϴ�. ���ӿ��� Player�� ������ ������ ���� �� �� �ִ� ������ �����
 * �ֽ��ϴ�. �ٷ� run(), jump(), turn()�Դϴ�. - �ʺ��� ���� : õõ�� �޸�(run) �� �ֽ��ϴ�. - �߱��� ���� :
 * ������ �޸���(run) ������(jump) �� �ֽ��ϴ�. - ����� ���� : ��û ������ �޸���(run) �����ϰ�(jump) ����(turn)
 * �� �ֽ��ϴ�. ��� �������� Player�� ����� �� �ִ� �ʻ���� go(int count)�޼��带 �����մϴ�. go()�޼���� �ѹ�
 * run�ϰ� �Ű������� ���޵� count��ŭ jump�ϰ�, �ѹ� turn�մϴ�. �� �������� �Ұ����� ����� ��û�ϸ� �� �� ���ٴ� �޼�����
 * ����մϴ�. ��°��) beginner : go(1), �߻� Ŭ���� �ҹ� advanced : go(2), �߻� Ŭ���� �ƺ� super :
 * go(3) �߻� �Ƶ�
 */
//�ʺ���,�߱���,����� ��� �ʻ�� go() �ִ�
//�ʺ��ڴ� run�� �߱��ڴ� jump ���� ����ڴ� turn����