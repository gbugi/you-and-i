package com.board.uni.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uni")
public class BoardController {
	
	@GetMapping("/board")
    public String getBoardList(Model model) {
		
//		boardList =  
//		model.addAttribute("boardList", )
				
        return "views/board";
    }
	
}
