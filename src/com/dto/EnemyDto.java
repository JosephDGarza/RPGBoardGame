package com.dto;

import java.io.Serializable;

public class EnemyDto extends CharacterDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String weakness;
	private int str;
	private int dodge;
	private int mana;
	private String imgurl; 
//	private int id;
//	private String name;
//	private int hp;
//	private int currentHp;
	
	public EnemyDto() {
		
	}
	

	
	public EnemyDto(int str, String imgurl, String name, int hp, int currentHp) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setName(name);
		this.setHp(currentHp);
		this.setCurrentHp(currentHp);
	}



	public EnemyDto(int str, String imgurl, int id, String name, int hp, int currentHp) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
	}




	
	public EnemyDto(String imgurl, int str) {
		this.imgurl = imgurl;
		this.str = str;

	}
	
	public EnemyDto(String weakness, int str, int dodge, int mana, String imgurl) {
		super();
		this.weakness = weakness;
		this.str = str;
		this.dodge = dodge;
		this.mana = mana;
		this.imgurl = imgurl;
	}
	
	
	public EnemyDto(String weakness, int str, int dodge, int mana, String imgurl, int id, String name, int hp,
			int currentHp) {
		super();
		this.weakness = weakness;
		this.str = str;
		this.dodge = dodge;
		this.mana = mana;
		this.imgurl = imgurl;
//		this.id = id;
//		this.name = name;
//		this.hp = hp;
//		this.currentHp = currentHp;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getHp() {
//		return hp;
//	}
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
//	public int getCurrentHp() {
//		return currentHp;
//	}
//	public void setCurrentHp(int currentHp) {
//		this.currentHp = currentHp;
//	}
	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
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

	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	

}
