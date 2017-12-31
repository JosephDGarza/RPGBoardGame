package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardPageController {

	@RequestMapping("board")
	public String index(Model model){
		String test = "Display some words please";
		String[] squares = new String[10];
//		Player player = new Player();
//		int hp;
//		player.setHp(hp);
//		String ability;
//		player.setAbility(ability);
//		int crit;
//		player.setCrit(crit);
//		int dodge;
//		player.setDodge(dodge);
//		int mana;
//		player.setMana(mana);
//		String name;
//		player.setName(name);
//		int str;
//		player.setStr(str);
		
		
		
		
		
		
		model.addAttribute("Myboard", test);
		
		
		return "board";
	}
}
