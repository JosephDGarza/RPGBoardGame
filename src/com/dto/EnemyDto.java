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
	private int miss;
	private String missScript;
	private String imgurl; 
	private String attack;
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
	public EnemyDto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
		this.attack = attack;
	}
	public EnemyDto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
		this.attack = attack;
		this.miss= miss;
		this.missScript = missScript;
		
	}
	
	public EnemyDto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript, int dodge) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
		this.attack = attack;
		this.miss= miss;
		this.missScript = missScript;
		this.dodge=dodge;
		
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
	}

	
	public String getMissScript() {
		return missScript;
	}



	public void setMissScript(String missScript) {
		this.missScript = missScript;
	}



	public String getAttack() {
		return attack;
	}



	public int getMiss() {
		return miss;
	}



	public void setMiss(int miss) {
		this.miss = miss;
	}



	public void setAttack(String attack) {
		this.attack = attack;
	}



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
