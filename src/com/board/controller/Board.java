package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.dto.EnemyDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



@Controller
public class Board {
	
	@RequestMapping("boards")
	public String boards(Model model, @RequestParam(value = "playerName") String playerName, @RequestParam(value = "playerHp") int playerHp,
			@RequestParam(value = "playerCurrentHp")int playerCurrentHp, @RequestParam(value = "playerStr") int playerStr, @RequestParam(value = "playerCrit") int playerCrit,
			@RequestParam(value = "playerDodge") int playerDodge) {
		
		int diceroll = 0;
		diceroll = (int) (Math.random() * 3 + 1);
		System.out.println(diceroll);

//		System.out.println(name);
//		
//		System.out.println(playerName + " " + playerHp + " " + playerCurrentHp + " " + playerStr + " " + playerCrit + " " + playerDodge + "This what what got printed");
//		
//		model.addAttribute("congrats", congrats);
		model.addAttribute("playerName", playerName);
		model.addAttribute("playerHp", playerHp);
		model.addAttribute("playerCurrentHp", playerCurrentHp);
		model.addAttribute("playerCrit", playerCrit);
		model.addAttribute("playerStr", playerStr);
		model.addAttribute("playerDodge", playerDodge);
		
		model.addAttribute("diceroll", diceroll);
		
//		model.addAttribute("id", id);
//		model.addAttribute("imgurl", imgurl);
//		model.addAttribute("name", name);
//		model.addAttribute("str", str);
//		model.addAttribute("hp", hp);
//		model.addAttribute("currentHp", currentHp);
		
		return "boards";
	}

}