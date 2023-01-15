package com.sda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;
}
