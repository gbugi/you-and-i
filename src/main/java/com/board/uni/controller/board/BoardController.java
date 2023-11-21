package com.board.uni.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("/uni/board")
    public String getBoardList() {
        return "views/board";
    }
}
