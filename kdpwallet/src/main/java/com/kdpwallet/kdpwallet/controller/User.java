package com.kdpwallet.kdpwallet.controller;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.sql.Blob;
import java.util.UUID;

@Entity
@Data
@Table(name = "users")
@RequiredArgsConstructor
public class User {

    @Id
    @Column(name = "userId")
    private String userId ;

    @Column(name = "firstName")
    @NonNull
    private String firstName;

    @Column(name = "lastName")
    @NonNull
    private String lastName;

    @Column(name = "email")
    @Email
    @NonNull
    private String email;

    @Column(name = "password")
    @NonNull
    private String password;

    public User() {

    }
}
