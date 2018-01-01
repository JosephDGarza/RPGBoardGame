package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardPageController {

	@RequestMapping("board")
	public String index(Model model, @RequestParam(value = "name") String name, @RequestParam(value = "hp") int hp,
			@RequestParam(value = "str") int str, @RequestParam(value = "crit") int crit,
			@RequestParam(value = "dodge") int dodge) {
		
		String test = "Display some words please";
		String[] squares = {"start", "Scrub","Frog King","Smiley"};
	
		hp=hp*25 +100;
		str = str +3;
		dodge = dodge +2;
		crit = crit +2;
		
		 Player player = new Player();
		player.setName(name);
		 player.setHp(hp);
		 player.setCrit(crit);
		 player.setDodge(dodge);
		 player.setName(name);
		 player.setStr(str);
		 player.setCurrentHp(hp);
		 
		 System.out.println(name + " " + hp + " " + player.getCurrentHp() + " " + str + " " + crit + " " + dodge);
		 
		model.addAttribute("Myboard", test);
		model.addAttribute("playerName", player.getName());
		model.addAttribute("playerHp", player.getHp());
		model.addAttribute("playerCurrentHp", player.getCurrentHp());
		model.addAttribute("playerCrit", player.getCrit());
		model.addAttribute("playerStr", player.getStr());
		model.addAttribute("playerDodge", player.getDodge());
		
		
		

		return "board";
	}
}
