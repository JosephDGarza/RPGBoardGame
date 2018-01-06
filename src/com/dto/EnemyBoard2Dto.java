package com.dto;

import java.io.Serializable;

public class EnemyBoard2Dto extends CharacterDto implements Serializable{
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
	private int exp;
	private String portrait;
	
//	private int id;
//	private String name;
//	private int hp;
//	private int currentHp;
	
	public EnemyBoard2Dto() {
		
	}
	

	
	public EnemyBoard2Dto(int str, String imgurl, String name, int hp, int currentHp) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setName(name);
		this.setHp(currentHp);
		this.setCurrentHp(currentHp);
	}



	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
	}
	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack) {
		super();
		this.str = str;
		this.imgurl = imgurl;
		this.setHp(currentHp);
		this.setName(name);
		this.setCurrentHp(currentHp);
		this.setId(id);
		this.attack = attack;
	}
	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript) {
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
	
	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript, int dodge) {
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
	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript, int dodge, int exp) {
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
		this.exp=exp;
		
	}

	public EnemyBoard2Dto(int str, String imgurl, int id, String name, int hp, int currentHp, String attack, int miss, String missScript, int dodge, int exp, String portrait) {
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
		this.exp=exp;
		this.portrait=portrait;
		
	}



	
	public EnemyBoard2Dto(String imgurl, int str) {
		this.imgurl = imgurl;
		this.str = str;

	}
	
	public EnemyBoard2Dto(String weakness, int str, int dodge, int mana, String imgurl) {
		super();
		this.weakness = weakness;
		this.str = str;
		this.dodge = dodge;
		this.mana = mana;
		this.imgurl = imgurl;
	}
	
	
	public EnemyBoard2Dto(String weakness, int str, int dodge, int mana, String imgurl, int id, String name, int hp,
			int currentHp) {
		super();
		this.weakness = weakness;
		this.str = str;
		this.dodge = dodge;
		this.mana = mana;
		this.imgurl = imgurl;
	}

	
	public String getPortrait() {
		return portrait;
	}



	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
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
