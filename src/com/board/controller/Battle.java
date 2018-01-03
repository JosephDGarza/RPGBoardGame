package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.dto.EnemyDto;

@Controller
public class Battle {
	
	@RequestMapping("battle")
	public String battle(Model model, @RequestParam(value= "playerName")String playerName, @RequestParam(value = "playerCurrentHp") int playerCurrentHp, @RequestParam(value = "playerHp") int playerHp,
			@RequestParam(value = "playerStr") int playerStr, @RequestParam(value = "playerCrit") int playerCrit,
			@RequestParam(value = "playerDodge") int playerDodge) {
//	public String battle(Model model) {
		
		 System.out.println(playerCurrentHp + " " + playerHp + " " +playerStr + " " + playerCrit + " " + playerDodge);
		
		 EnemyDto frog = new EnemyDto();
		frog.setHp(35);
		frog.setCurrentHp(35);
		frog.setDodge(2);
		frog.setName("Frog King");
		frog.setStr(11);
		frog.setId(0);
		
		
		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);
		
		model.addAttribute("name", frog.getName());
		model.addAttribute("enemyHp", frog.getHp());
		model.addAttribute("enemyCurrentHp", frog.getCurrentHp());
		model.addAttribute("enemyStr", frog.getStr());
		model.addAttribute("diceroll", frog.getId());
		
		
		
		return "battle";
	}

}
