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

import com.dto.BackgroundDto;
import com.dto.EnemyDto;

@Controller
public class Battles {

	@RequestMapping("battles")
	public String battle(Model model, @RequestParam(value = "playerName") String playerName,
			@RequestParam(value = "playerCurrentHp") int playerCurrentHp,
			@RequestParam(value = "playerHp") int playerHp, @RequestParam(value = "playerStr") int playerStr,
			@RequestParam(value = "playerCrit") int playerCrit, @RequestParam(value = "playerDodge") int playerDodge,
			@RequestParam(value = "diceroll") int diceroll, @RequestParam(value = "tile") int tile,
			@RequestParam(value = "rollCount") int rollCount, @RequestParam(value = "playerCharacter") String playerCharacter) {
	
		System.out.println("diceroll");
		String congrats = "<h1>Congratulations, you have defeated the frog king!</h1>";
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		// System.out.println(tag);

		int id = 0;
		String imgurl = "";
		String name = "";
		int str = 0;
		int hp = 0;
		int currentHp = 0;
		int miss = 0;
		String missScript = "";
		String attack = "";
		Object[] obj = new Object[9];


		
		//Selecting the battle based on the tile location
		
		String query = "select id,imgurl,name,str,hp,currentHp,miss,missScript,attack from EnemyDto WHERE id = '"
				+ tile + "'";

		System.out.println(query);
		Query q2 = s.createQuery(query);

		q2.setFirstResult(0);
		q2.setMaxResults(1);
		List results = q2.list();
		Iterator i = results.iterator();
		List<EnemyDto> list = new ArrayList<EnemyDto>();
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
			
			
			//increasing difficult after going round the board
			if (diceroll > 17) {
				str = (int) (str*1.10);
				hp = (int) (hp *1.10);
				currentHp = (int) (currentHp*1.10);
				
			}
			
			if (diceroll > 34) {
				str = (int) (str*1.10);
				hp = (int) (hp *1.10);
				currentHp = (int) (currentHp*1.10);
			}
			
			if (diceroll > 51) {
				str = (int) (str*1.25);
				hp = (int) (hp *1.25);
				currentHp = (int) (currentHp*1.25);
			}
			if (diceroll > 68) {
				str = (int) (str*1.25);
				hp = (int) (hp *1.25);
				currentHp = (int) (currentHp*1.25);
			}

			System.out.println(name);
			list.add(new EnemyDto(str, imgurl, id, name, hp, currentHp, attack, miss, missScript));
		}
		
/*		REMOVED RANDOM BACKGROUND GENERATOR DUE TO HORRIBLE RESPONSE TIME
		
		
		*/
//		String background ="";
//		query ="select stageimg from BackgroundDto order by rand()";
//		Object[] objImg = new Object[1];
//		
//		q2 = s.createQuery(query);
//
//		q2.setFirstResult(0);
//		q2.setMaxResults(1);
//		List backgroundResults = q2.list();
//		i = results.iterator();
//		List<BackgroundDto> Background = new ArrayList<BackgroundDto>();
//		while (i.hasNext()) {
//			background = (String) objImg[0];
//			Background.add(new BackgroundDto(background));
//		}
//		
		
		
		

		s.flush();
		s.close();
//		model.addAttribute("background", background);
		model.addAttribute("playerCharacter", playerCharacter);
		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);
		model.addAttribute("diceroll", diceroll);
		model.addAttribute("tile",tile);
		model.addAttribute("rollCount",rollCount);

		model.addAttribute("id", id);
		model.addAttribute("imgurl", imgurl);
		model.addAttribute("name", name);
		model.addAttribute("str", str);
		model.addAttribute("hp", hp);
		model.addAttribute("currentHp", currentHp);
		model.addAttribute("attack", attack);
		model.addAttribute("miss", miss);
		model.addAttribute("missScript", missScript);

		return "battles";
	}
}
