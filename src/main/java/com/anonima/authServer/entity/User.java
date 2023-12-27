package com.anonima.authServer.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {


    public UUID user_id; // will be assigned automatically
    public String user_name; // will be randomly assigned
    public String email;
    public String password; //from response
    public String role; // will be discussed later
    public String company_name; //from response

    public User(String user_name, String email, String password, String role, String company_name) {
        this.user_id = UUID.randomUUID();
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.company_name = company_name;
    }
}
