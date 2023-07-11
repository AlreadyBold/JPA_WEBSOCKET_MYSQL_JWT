package com.JpaChat.jpachatstudy.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "testtable")
@Getter
@Setter
public class testtable {

    @Id
    @GeneratedValue
    @Column(name = "user_no")
    private Long userNo;

    private String userName;

    private LocalDateTime joinDate;

}
