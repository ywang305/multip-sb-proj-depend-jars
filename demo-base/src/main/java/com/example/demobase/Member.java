package com.example.demobase;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Member {
    @Id
    private String memberId;
}
