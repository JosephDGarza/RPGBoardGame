package com.dto;

import java.io.Serializable;

public abstract class  CharacterDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int hp;
	private int currentHp;

	
	public CharacterDto() {
		
	}


	public CharacterDto(String name, int hp, int currentHp) {
		super();
		this.name = name;
		this.hp = hp;
		this.currentHp = currentHp;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
