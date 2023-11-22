package com.board.uni.account.entity;

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
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Account {

    @Id @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)", name= "account_id")
    private UUID id; // unhex(replace(uuid(),'-','')) DB Default
   
    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 100)
    private String name;

    @Column(length = 100, nullable = false)
    private String password;


    @Enumerated(EnumType.STRING)
    @ColumnDefault("'ACTIVE'")
    private StatusEnum status = StatusEnum.ACTIVE;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'USER'")
    private RoleEnum role = RoleEnum.USER;
    
    @CreationTimestamp
    private LocalDateTime createdAt = LocalDateTime.now();
    
    @UpdateTimestamp
    private LocalDateTime updatedAt = LocalDateTime.now();

    // 로그인하면 Spring security 로그인 성공 시 lastLogin을 update
    private LocalDateTime lastLogin;
    
    @Builder
    public Account(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
    
//    public Account hashPassword(PasswordEncoder passwordEncoder){
//        this.password = passwordEncoder.encode(this.password);
//        return this;
//    }
}
