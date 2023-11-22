package com.board.uni.board.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.uni.board.dto.BoardDto;
import com.board.uni.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	// 회원정보 전체조회(findAll)
    @Cacheable(cacheNames = "getBoard", key = "'ALL'", cacheManager = "cacheManager")
    public List<BoardDto> findAll() {
    	List<BoardDto> boardDto = boardRepository.findAll();
    	return boardDto; 
	}

}
