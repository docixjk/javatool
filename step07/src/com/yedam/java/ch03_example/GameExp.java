package com.yedam.java.ch03_example;

public class GameExp {

	public static void main(String[] args) {
		Player p1 = new Player();
		p1.play(1);
		
		p1.upLv(new Advanced());
		p1.play(2);
		
		p1.upLv(new Super());
		p1.play(3);

	}

}
