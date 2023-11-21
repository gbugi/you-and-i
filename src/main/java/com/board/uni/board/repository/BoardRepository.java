//package com.board.uni.board.repository;
//
//
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.board.uni.board.dto.BoardDto;
//import com.querydsl.core.types.Projections;
//import com.querydsl.jpa.impl.JPAQueryFactory;
////import static com.board.uni.board.entity.QBoard.board;
//
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//@Repository
//public class BoardRepository {
//	
//	private final EntityManager em;
//	private final JPAQueryFactory queryFactory;
//	
//	// 회원조회 QueryDSL
//		public List<BoardDto> findAll() {
//			return queryFactory
//					.select(Projections.fields(BoardDto.class,
//							board.id,
//							board.content,
//							board.subContent,
//							board.startDt,
//							board.deadline,
//							board.status,
//							board.priority,
//							board.createdAt,
//							board.updatedAt,
//					))
//					.from(board)
//					.fetch();
//		}
//}
