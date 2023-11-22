package com.board.uni.board.entity;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Board {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(length = 100)
    private String content;

    @Column(columnDefinition = "TEXT")
    private String subContent;
    
    private LocalDate startDt;
    private LocalDate deadline;
    
    @Enumerated(EnumType.STRING)
    @ColumnDefault("'Not_started'")
    private StatusEnum status = StatusEnum.Not_started;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'Medium'")
    private PriorityEnum priority = PriorityEnum.Medium;
    
    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
    
    @UpdateTimestamp
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Builder
    public Board(Long id) {
        this.id = id;
    }
    
}
