package com.dto;

import java.io.Serializable;

public class PlayerDto extends CharacterDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int str;
	private int dodge;
	private int crit;
	private int mana;
	private String ability;
	
	public PlayerDto(){
		
	}
	
	
	
	public PlayerDto(int str, int dodge, int crit, int mana, String ability) {
		super();
		this.str = str;
		this.dodge = dodge;
		this.crit = crit;
		this.mana = mana;
		this.ability = ability;
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
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}



	@Override
	public String toString() {
		return "Player [str=" + str + ", dodge=" + dodge + ", crit=" + crit + ", mana=" + mana + ", ability=" + ability
				+ "]";
	}
	
	
}
