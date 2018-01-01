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
		System.out.println(name + " " + (hp*25 +100) + " " + str + " " + crit + " " + dodge);
		String test = "Display some words please";
		String[] squares = new String[10];
		 Player player = new Player();
		
		 player.setHp(hp*25 + 100);
		 player.setCrit(crit);
		 player.setDodge(dodge);
		 player.setName(name);
		 player.setStr(str);
		 player.setCurrentHp(hp);

		model.addAttribute("Myboard", test);
		model.addAttribute("stats", player.toString());

		return "board";
	}
}
