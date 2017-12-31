package com.board.controller;

public class Enemy extends Character {
	String weakness;
	int str;
	int dodge;
	int crit;
	int mana;
	
	public Enemy() {
		
	}
	
	public Enemy(String weakness, int str, int dodge, int crit, int mana) {
		super();
		this.weakness = weakness;
		this.str = str;
		this.dodge = dodge;
		this.crit = crit;
		this.mana = mana;
	}
	
	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getCrit() {
		return crit;
	}
	public void setCrit(int crit) {
		this.crit = crit;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	

}
