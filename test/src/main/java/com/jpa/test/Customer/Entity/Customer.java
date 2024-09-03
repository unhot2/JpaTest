package com.jpa.test.Customer.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity // 엔티티 지정 어노테이션
public class Customer {
    @Id // PK 지정하는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 값 자동 지정 (시퀀스) 어노테이션
    private int id;
    private String name;
    @Column(length = 1024) // 컬럼속성 지정 어노테이션
    private String address;
    private String primaryContact;
}
