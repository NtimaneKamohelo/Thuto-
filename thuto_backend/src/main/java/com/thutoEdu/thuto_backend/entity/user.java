package com.thutoEdu.thuto_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increments
    private Long id; //primary key

    private String name;
    private String email;
    private String phone;

    //Password
    private char[] password;
}
