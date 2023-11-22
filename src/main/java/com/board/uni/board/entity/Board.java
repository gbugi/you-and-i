package com.board.uni.board.entity;


import java.time.LocalDateTime;
import java.util.UUID;


import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Board {
	
	@Id
    @Column(name = "board_id")
    private UUID id;

    @Column(length = 100)
    private String content;

    @Column(columnDefinition = "TEXT")
    private String subContent;
    
    private LocalDateTime startDt;
    private LocalDateTime deadline;
    
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
    public Board(UUID id) {
        this.id = id;
    }
    
}
