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

import com.dto.EnemyDto;



@Controller
public class Battles {

	@RequestMapping("battles")
	public String battle(Model model, @RequestParam(value = "playerName") String playerName,
			@RequestParam(value = "playerCurrentHp") int playerCurrentHp,
			@RequestParam(value = "playerHp") int playerHp, @RequestParam(value = "playerStr") int playerStr,
			@RequestParam(value = "playerCrit") int playerCrit, @RequestParam(value = "playerDodge") int playerDodge, @RequestParam(value="diceroll") int diceroll) {
		// public String battle(Model model) {
		
//		@RequestParam(value = "id") int id, @RequestParam(value = "imgurl") String imgurl,
//		@RequestParam(value = "name") String name, @RequestParam(value = "str") String str,
//		@RequestParam(value = "hp") String hp, @RequestParam(value = "currentHp") String currentHp
		
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
		int str  = 0;
		int hp = 0;
		int currentHp =0;
		Object[] obj = new Object[5];


		
		String query = "select id,imgurl,name,str,hp,currentHp from EnemyDto WHERE id = '" + diceroll +"'";

		System.out.println(query);
		Query q2 = s.createQuery(query);

		q2.setFirstResult(0);
		q2.setMaxResults(1);
		List results = q2.list();
		Iterator i = results.iterator();
		List<EnemyDto> list = new ArrayList<EnemyDto>();
		while (i.hasNext()) {

			// Objects position is being correlated by the createQuery above. IE. g.appID is
			// the first, so that would be obj[0]
			obj = (Object[]) i.next();
			id = (int) obj[0];
			imgurl = (String) obj[1];
			name = (String) obj[2];
			str = (int) obj[3];
			hp = (int) obj[4];
			currentHp = (int) obj[5];
			System.out.println(name);
			list.add(new EnemyDto(str, imgurl, id, name, hp, currentHp));
		}
		
		
	
		s.flush();
		s.close();
		

		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);

		model.addAttribute("id", id);
		model.addAttribute("imgurl", imgurl);
		model.addAttribute("name", name);
		model.addAttribute("str", str);
		model.addAttribute("hp", hp);
		model.addAttribute("currentHp", currentHp);

		return "battles";
	}
}

