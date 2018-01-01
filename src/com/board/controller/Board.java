package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Board {
	
	@RequestMapping("boards")
	public String boards(Model model, @RequestParam(value = "playerName") String playerName, @RequestParam(value = "playerHp") int playerHp,
			@RequestParam(value = "playerCurrentHp")int playerCurrentHp, @RequestParam(value = "playerStr") int playerStr, @RequestParam(value = "playerCrit") int playerCrit,
			@RequestParam(value = "playerDodge") int playerDodge) {
		String congrats = "<h1>Congratulations, you have defeated the frog king!</h1>";
		 
		
		System.out.println(playerName + " " + playerHp + " " + playerCurrentHp + " " + playerStr + " " + playerCrit + " " + playerDodge + "This what what got printed");
		
		model.addAttribute("congrats", congrats);
		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);
		
		return "boards";
	}

}
