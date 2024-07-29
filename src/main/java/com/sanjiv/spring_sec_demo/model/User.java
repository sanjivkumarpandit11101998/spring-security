package com.sanjiv.spring_sec_demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    private String username;
    private String password;

//    public String getUsername() {
//        return this.username;
//    }
//
//    public String getPassword() {
//        return this.password;
//    }
}
