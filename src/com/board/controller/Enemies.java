package com.board.controller;

public class Enemies {
	
	public static void main(String[] args) {
		Enemy scrub = new Enemy();
		scrub.setHp(25);
		scrub.setDodge(2);
		scrub.setName("Scrub");
		scrub.setStr(8);
		
		Enemy frog = new Enemy();
		frog.setHp(35);
		frog.setDodge(2);
		frog.setName("Frog King");
		frog.setStr(11);
		
		Enemy smiley = new Enemy();
		smiley.setHp(35);
		smiley.setDodge(2);
		smiley.setName("Smiley");
		smiley.setStr(11);
		
	}

}
