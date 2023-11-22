package com.board.uni.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.board.uni.board.dto.BoardDto;
import com.board.uni.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/uni")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	@GetMapping("/board")
    public String getBoardList(Model model) {
		
		List<BoardDto> boardList = boardService.findAll();
		model.addAttribute("boardList", boardList);
				
        return "views/board";
    }
	
//	@GetMapping("/board")
//	public String getBoard(Model model) {
		
//		List<BoardDto> boardList = boardService.findById();
//	}
	
}
