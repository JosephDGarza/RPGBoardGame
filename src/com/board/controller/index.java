package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.FullBoardMaker;

@Controller
public class index {
	
	@RequestMapping({"/", "index"})
	public String index(Model model) {
		
		String str = "str determines your damage output. For each point of Str, you deal one more damage.";
		String hp = "hp determines your health overall. This is a defensive stat to help keep you alive. Each point increases your hp by 25";
		String dodge = "Dodge allows your character to become evasive and not take any damage from enemies. Each point increases your chance of not being hit by 1%";
		String crit = "Crit gives you a chance of dealing double damage. For each point, it increases the chance by 1%";
	
		FullBoardMaker board = new FullBoardMaker();
		String divs = "";
		board.boardCreation(divs);
		System.out.println(divs);
		model.addAttribute("divs", divs);
		model.addAttribute("str", str);
		model.addAttribute("hp", hp);
		model.addAttribute("dodge", dodge);
		model.addAttribute("crit", crit);
		
		
		return "index";
	}
	

}
