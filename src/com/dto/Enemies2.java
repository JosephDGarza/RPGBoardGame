package com.dto;

import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Enemies2 {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		

		
		EnemyBoard2Dto ares = new EnemyBoard2Dto();
		ares.setHp(55);
		ares.setCurrentHp(55);
		ares.setDodge(2);
		ares.setName("Ares");
		ares.setStr(10);
		ares.setImgurl("<img src=\"resources/images/Combatimages/Ares.png\">");
		ares.setPortrait("<img src=\"resources/images/BoardPortraits/AresPort.png\">");
		ares.setAttack("Ares shackles you with his chains for ");
		ares.setMiss(10);
		ares.setMissScript("Ares missed his incredibly hard chains. No damage taken");
		ares.setExp(175);
		
		
		EnemyBoard2Dto batman = new EnemyBoard2Dto();
		batman.setHp(45);
		batman.setCurrentHp(45);
		batman.setDodge(2);
		batman.setName("Batman");
		batman.setStr(12);
		batman.setImgurl("<img src=\"resources/images/Combatimages/Batman.png\">");
		batman.setPortrait("<img src=\"resources/images/BoardPortraits/Batman.png\">");
		batman.setAttack("Batman throws a batarang at you for ");
		batman.setMiss(8);
		batman.setMissScript("Batman missed his batarang! No damage taken");
		batman.setExp(200);
		
		EnemyBoard2Dto bison = new EnemyBoard2Dto();
		bison.setHp(50);
		bison.setCurrentHp(50);
		bison.setDodge(2);
		bison.setName("Bison");
		bison.setStr(11);
		bison.setImgurl("<img src=\"resources/images/Combatimages/Mbison.gif\">");
		bison.setPortrait("<img src=\"resources/images/BoardPortraits/BisonPort.png\">");
		bison.setAttack("Bison hits you with Psycho Crusher for ");
		bison.setMiss(9);
		bison.setMissScript("Bison was too busy holding back on his controller. No damage taken");
		bison.setExp(225);
		
		
		EnemyBoard2Dto cloud = new EnemyBoard2Dto();
		cloud.setHp(40);
		cloud.setCurrentHp(40);
		cloud.setDodge(2);
		cloud.setName("Cloud");
		cloud.setStr(14);
		cloud.setImgurl("<img src=\"resources/images/Combatimages/Cloud.png\">");
		cloud.setPortrait("<img src=\"resources/images/BoardPortraits/Cloudport.png\">");
		cloud.setAttack("Cloud slashes with his sword for ");
		cloud.setMiss(12);
		cloud.setMissScript("Cloud couldn't lift his sword. No damage taken");
		cloud.setExp(200);
		
		
		EnemyBoard2Dto ezreal  = new EnemyBoard2Dto();
		ezreal.setHp(25);
		ezreal.setCurrentHp(25);
		ezreal.setDodge(2);
		ezreal.setName("Ezreal");
		ezreal.setStr(15);
		ezreal.setImgurl("<img src=\"resources/images/Combatimages/Ezreal.png\">");
		ezreal.setPortrait("<img src=\"resources/images/BoardPortraits/Ezrealport.png\">");
		ezreal.setAttack("Ezreal sits there shooting you as your support is MIA for ");
		ezreal.setMiss(10);
		ezreal.setMissScript("Ezreal's support was missing. No damage taken");
		ezreal.setExp(225);
		
		EnemyBoard2Dto goku = new EnemyBoard2Dto();
		goku.setHp(50);
		goku.setCurrentHp(50);
		goku.setDodge(7);
		goku.setName("SSB Goku");
		goku.setStr(15);
		goku.setImgurl("<img src=\"resources/images/Combatimages/Goku.png\">");
		goku.setPortrait("<img src=\"resources/images/BoardPortraits/GokuPort.png\">");
		goku.setAttack("Goku shoots you with a Ka Me Ha Me Ha for ");
		goku.setMiss(15);
		goku.setMissScript("Goku isn't taking things seriously. No damage taken");
		goku.setExp(250);
		
		EnemyBoard2Dto heart = new EnemyBoard2Dto();
		heart.setHp(1);
		heart.setCurrentHp(1);
		heart.setDodge(0);
		heart.setName("Heal");
		heart.setStr(-50);
		heart.setImgurl("<img src=\"https://i.giphy.com/media/xUPGcgvoipFxRtpMl2/giphy.webp\"\r\n" + 
				"	width=\"500\" height=\"500\">");
		heart.setPortrait("<img src=\"https://i.giphy.com/media/xUPGcgvoipFxRtpMl2/giphy.webp\"\r\n" + 
				"	width=\"175\" height=\"175\">");
		heart.setAttack("You've been healed for 50 health!");
		heart.setMiss(0);
		heart.setMissScript("");
		heart.setExp(0);
		
		EnemyBoard2Dto jayce = new EnemyBoard2Dto();
		jayce.setHp(30);
		jayce.setCurrentHp(30);
		jayce.setDodge(2);
		jayce.setName("Jayce");
		jayce.setStr(7);
		jayce.setImgurl("<img src=\"resources/images/Combatimages/Jayce.png\">");
		jayce.setPortrait("<img src=\"resources/images/BoardPortraits/JaycePort.png\">");
		jayce.setAttack("Jayce shoots you across the entire lane for ");
		jayce.setMiss(7);
		jayce.setMissScript("You got sick of Jayce and went into another lane. No damage taken");
		jayce.setExp(150);
		
		
		
		
		EnemyBoard2Dto knight = new EnemyBoard2Dto();
		knight.setHp(35);
		knight.setCurrentHp(35);
		knight.setDodge(2);
		knight.setName("Knight");
		knight.setStr(10);
		knight.setImgurl("<img src=\"resources/images/Combatimages/Knight.png\">");
		knight.setPortrait("<img src=\"resources/images/BoardPortraits/KnightPort.png\">");
		knight.setAttack("Knight slashes you for ");
		knight.setMiss(5);
		knight.setMissScript("Knight realized hes actually right handed. No damage taken");
		knight.setExp(175);
		
		EnemyBoard2Dto masterCheif  = new EnemyBoard2Dto();
		masterCheif.setHp(45);
		masterCheif.setCurrentHp(45);
		masterCheif.setDodge(2);
		masterCheif.setName("Master Cheif");
		masterCheif.setStr(9);
		masterCheif.setImgurl("<img src=\"resources/images/Combatimages/masterCheif.png\">");
		masterCheif.setPortrait("<img src=\"resources/images/BoardPortraits/MCportrait.png\">");
		masterCheif.setAttack("Master Cheif checks you in the back for ");
		masterCheif.setMiss(5);
		masterCheif.setMissScript("Master Cheif is being played by Caboose. No damage taken");
		masterCheif.setExp(200);
		
		EnemyBoard2Dto lichKing  = new EnemyBoard2Dto();
		lichKing.setHp(60);
		lichKing.setCurrentHp(60);
		lichKing.setDodge(2);
		lichKing.setName("Lich King");
		lichKing.setStr(20);
		lichKing.setImgurl("<img src=\"resources/images/Combatimages/The_Lich_King.png\">");
		lichKing.setPortrait("<img src=\"resources/images/BoardPortraits/LichkingPort.png\">");
		lichKing.setAttack("Lich King hits you with Frostmourne for ");
		lichKing.setMiss(40);
		lichKing.setMissScript("Lich King lets his minions take care of you. No damage taken");
		lichKing.setExp(275);
		
		EnemyBoard2Dto megaman  = new EnemyBoard2Dto();
		megaman.setHp(40);
		megaman.setCurrentHp(40);
		megaman.setDodge(2);
		megaman.setName("Megaman");
		megaman.setStr(7);
		megaman.setImgurl("<img src=\"resources/images/Combatimages/Megaman.png\">");
		megaman.setPortrait("<img src=\"resources/images/BoardPortraits/Megamanport.png\">");
		megaman.setAttack("Megaman shoots his blaster for ");
		megaman.setMiss(10);
		megaman.setMissScript("Megaman is charging his blaster... no damage taken");
		megaman.setExp(175);
		
		EnemyBoard2Dto arm  = new EnemyBoard2Dto();
		arm.setHp(1);
		arm.setCurrentHp(1);
		arm.setDodge(0);
		arm.setName("Strength Bonus");
		arm.setStr(0);
		arm.setImgurl("<img src=\"resources/images/Combatimages/Strength.png\">");
		arm.setPortrait("<img src=\"resources/images/BoardPortraits/StrengthPort.png\">");
		arm.setAttack("You have gained 1+str ");
		arm.setMiss(0);
		arm.setMissScript("");
		arm.setExp(0);
		
		EnemyBoard2Dto wolverine  = new EnemyBoard2Dto();
		wolverine.setHp(45);
		wolverine.setCurrentHp(45);
		wolverine.setDodge(5);
		wolverine.setName("Wolverine");
		wolverine.setStr(12);
		wolverine.setImgurl("<img src=\"resources/images/Combatimages/Wolverine.png\">");
		wolverine.setPortrait("<img src=\"resources/images/BoardPortraits/WolverinePort.png\">");
		wolverine.setAttack("Wolverine stabs you with his claws for ");
		wolverine.setMiss(5);
		wolverine.setMissScript("Magneto came, no idea where wolverine went. No damage taken");
		wolverine.setExp(225);
		
		EnemyBoard2Dto sonic  = new EnemyBoard2Dto();
		sonic.setHp(30);
		sonic.setCurrentHp(30);
		sonic.setDodge(40);
		sonic.setName("Sonic");
		sonic.setStr(10);
		sonic.setImgurl("<img src=\"resources/images/Combatimages/Sonic.png\">");
		sonic.setPortrait("<img src=\"resources/images/BoardPortraits/SonicPort.png\">");
		sonic.setAttack("Sonic jumps on your head for ");
		sonic.setMiss(11);
		sonic.setMissScript("Sonic turns into a ball and starts rolling in a straight line. You step to the side. No damage taken");
		sonic.setExp(200);
		
		EnemyBoard2Dto Rifleman = new EnemyBoard2Dto();
		Rifleman.setHp(30);
		Rifleman.setCurrentHp(30);
		Rifleman.setDodge(0);
		Rifleman.setName("Rifleman...RifleLady?");
		Rifleman.setStr(14);
		Rifleman.setImgurl("<img src=\"resources/images/Combatimages/RifleChick.png\">");
		Rifleman.setPortrait("<img src=\"resources/images/BoardPortraits/RiflePort.png\">");
		Rifleman.setAttack("You were shot by a musket for ");
		Rifleman.setMiss(12);
		Rifleman.setMissScript("Reloading that old school musket. No damage taken");
		Rifleman.setExp(150);
		
		
		
		
		ArrayList<EnemyBoard2Dto> data = new ArrayList<EnemyBoard2Dto>();
		data.add(batman);
		data.add(ares);
		data.add(cloud);
		data.add(bison);
		data.add(ezreal);
		data.add(goku);
		data.add(heart);
		data.add(jayce);
		data.add(knight);
		data.add(masterCheif);
		data.add(lichKing);
		data.add(megaman);
		data.add(arm);
		data.add(wolverine);
		data.add(sonic);
		data.add(Rifleman);
	
		
		
		
		
		
		
		

		
		for (int i =0; i< data.size(); i++) {
			System.out.println(data.get(i));
			Session session = factory.openSession();
			Transaction t = (Transaction) session.beginTransaction();

			session.persist(data.get(i));
			t.commit();
			session.close();
		
		}
		
		System.out.println("emeny update complete.");
	}

}
