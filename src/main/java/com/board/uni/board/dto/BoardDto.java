package com.board.uni.board.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.board.uni.board.entity.StatusEnum;
import com.board.uni.board.entity.Board;
import com.board.uni.board.entity.PriorityEnum;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {
	private UUID id;

    private String content;

    private String subContent;
    
    private LocalDate startDt;
    
    private LocalDate deadline;
    
    private StatusEnum status;

    private PriorityEnum priority;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime createdAt;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime updatedAt;

    
    // entity to dto
	public BoardDto(Board entity) {
		this.id = entity.getId();
		this.content = entity.getContent();
		this.subContent = entity.getSubContent();
		this.startDt = entity.getStartDt();
		this.deadline = entity.getDeadline();
		this.status = entity.getStatus();
		this.priority = entity.getPriority();
		this.createdAt = entity.getCreatedAt();
		this.updatedAt = entity.getUpdatedAt();
	}
    
}