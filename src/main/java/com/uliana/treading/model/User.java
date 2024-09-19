package com.uliana.treading.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uliana.treading.domain.USER_ROLE;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
}
