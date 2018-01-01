package com.board.controller;


public abstract class  Character {
	String name;
	int hp;
	int currentHp;

	
	public Character() {
		
	}


	public Character(String name, int hp, int currentHp) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = currentHp;
	}


	public int getCurrentHp() {
		return currentHp;
	}


	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	@Override
	public String toString() {
		return "Character [name=" + name + ", hp=" + hp + ", currentHp=" + currentHp + "]";
	}
	
	
	
	
	
	
	

}
