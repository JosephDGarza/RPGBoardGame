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
			@RequestParam(value = "playerDodge") int playerDodge, @RequestParam(value = "diceroll") int diceroll,
			@RequestParam(value = "tile") int tile, @RequestParam(value = "rollCount") int rollCount) {
//		System.out.println(diceroll);
		int dice = 0;
		rollCount = rollCount + 1;
		dice = (int) (Math.random() * 5 + 1);
		diceroll = diceroll+dice;
		tile = diceroll;
		if (diceroll > 17) {
			tile = diceroll - 17;
		}
		if (diceroll > 34) {
			tile = diceroll - 34;
		}
		if (diceroll > 41) {
			tile = diceroll - 41;
		}
		if (diceroll > 58) {
			tile = diceroll - 58;
		}
		System.out.println(dice);
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
		
		model.addAttribute("dice", dice);
		model.addAttribute("diceroll", diceroll);
		model.addAttribute("tile",tile);
		model.addAttribute("rollCount",rollCount);
		
//		model.addAttribute("id", id);
//		model.addAttribute("imgurl", imgurl);
//		model.addAttribute("name", name);
//		model.addAttribute("str", str);
//		model.addAttribute("hp", hp);
//		model.addAttribute("currentHp", currentHp);
		
		
		
		return "boards";
	}

}
