package com.board.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.EnemyBoard2Dto;

@Controller
public class HardBattles {
	@RequestMapping("hardbattles")
	public String battle(Model model, @RequestParam(value = "playerName") String playerName,
			@RequestParam(value = "playerCurrentHp") int playerCurrentHp,
			@RequestParam(value = "playerHp") int playerHp, @RequestParam(value = "playerStr") int playerStr,
			@RequestParam(value = "playerCrit") int playerCrit, @RequestParam(value = "playerDodge") int playerDodge,
			@RequestParam(value = "diceroll") int diceroll, @RequestParam(value = "tile") int tile,
			@RequestParam(value = "rollCount") int rollCount,
			@RequestParam(value = "playerCharacter") String playerCharacter,
			@RequestParam(value = "playerExp") int playerExp, @RequestParam(value = "currentExp") int currentExp,
			@RequestParam(value = "level") int level) {
		
		String playerPortrait = "";
		if (playerCharacter.equalsIgnoreCase("Warrior")) {
		playerPortrait = "<img src=\"resources/images/Character1.png\" height=\"50\" width=\"50\">";
			
		}
		
		if (playerCharacter.equalsIgnoreCase("Ninja")) {
			playerPortrait = "<img src=\"resources/images/Character2.png\" height=\"50\" width=\"50\">";
		}
		System.out.println(playerPortrait);
		System.out.println("diceroll");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// System.out.println(tag);

		int id = 0;
		String imgurl = "";
		String portrait = "";
		String name = "";
		int str = 0;
		int hp = 0;
		int currentHp = 0;
		int miss = 0;
		String missScript = "";
		String attack = "";
		int dodge = 0;
		int exp =0;
		Object[] obj = new Object[12];

		// Selecting the battle based on the tile location
		System.out.println(tile);
		String query = "select id,imgurl, name,str,hp,currentHp,miss,missScript,attack,dodge, exp, portrait from EnemyBoard2Dto WHERE id = '"
				+ tile + "'";

		System.out.println(query);
		Query q2 = s.createQuery(query);

		q2.setFirstResult(0);
		q2.setMaxResults(1);
		List results = q2.list();
		Iterator i = results.iterator();
		List<EnemyBoard2Dto> list = new ArrayList<EnemyBoard2Dto>();
		while (i.hasNext()) {

			obj = (Object[]) i.next();
			id = (int) obj[0];
			imgurl = (String) obj[1];
			
			name = (String) obj[2];
			str = (int) obj[3];
			hp = (int) obj[4];
			currentHp = (int) obj[5];
			miss = (int) obj[6];
			missScript = (String) obj[7];
			attack = (String) obj[8];
			dodge = (int) obj[9];
			exp = (int) obj[10];
			portrait = (String) obj[11];
			System.out.println(exp);
			String[] portfix;
			portfix = portrait.split("\">");
					
			portrait = portfix[0] + "\" height=\"50\" width=\"50\">";
			// increasing difficult after going round the board
			if (diceroll > 16) {
				str = (int) (str * 1.30);
				hp = (int) (hp * 1.30);
				currentHp = (int) (currentHp * 1.30);

			}

			if (diceroll > 32) {
				str = (int) (str * 1.30);
				hp = (int) (hp * 1.30);
				currentHp = (int) (currentHp * 1.30);
			}

			if (diceroll > 48) {
				str = (int) (str * 1.25);
				hp = (int) (hp * 1.25);
				currentHp = (int) (currentHp * 1.25);
			}
			if (diceroll > 64) {
				str = (int) (str * 1.25);
				hp = (int) (hp * 1.25);
				currentHp = (int) (currentHp * 1.25);
			}

			System.out.println(name);
			
			list.add(new EnemyBoard2Dto(str, imgurl, id, name, hp, currentHp, attack, miss, missScript, dodge, exp, portrait));
		}

		/*
		 * REMOVED RANDOM BACKGROUND GENERATOR DUE TO HORRIBLE RESPONSE TIME
		 * 
		 * 
		 */
		// String background ="";
		// query ="select stageimg from BackgroundDto order by rand()";
		// Object[] objImg = new Object[1];
		//
		// q2 = s.createQuery(query);
		//
		// q2.setFirstResult(0);
		// q2.setMaxResults(1);
		// List backgroundResults = q2.list();
		// i = results.iterator();
		// List<BackgroundDto> Background = new ArrayList<BackgroundDto>();
		// while (i.hasNext()) {
		// background = (String) objImg[0];
		// Background.add(new BackgroundDto(background));
		// }
		//

		s.flush();
		s.close();
		// model.addAttribute("background", background);
		model.addAttribute("playerExp", playerExp);
		model.addAttribute("currentExp", currentExp);
		model.addAttribute("level", level);
		model.addAttribute("playerCharacter", playerCharacter);
		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);
		model.addAttribute("diceroll", diceroll);
		model.addAttribute("tile", tile);
		model.addAttribute("rollCount", rollCount);
		model.addAttribute("portrait", portrait);
		model.addAttribute("playerPortrait", playerPortrait);
		
		
		model.addAttribute("portrait", portrait);
		model.addAttribute("exp", exp);
		model.addAttribute("id", id);
		model.addAttribute("imgurl", imgurl);
		model.addAttribute("name", name);
		model.addAttribute("str", str);
		model.addAttribute("hp", hp);
		model.addAttribute("currentHp", currentHp);
		model.addAttribute("attack", attack);
		model.addAttribute("miss", miss);
		model.addAttribute("missScript", missScript);
		model.addAttribute("dodge", dodge);

		return "hardbattles";
	}
}
