package com.rs.ecommerce.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 50,nullable = true)
    private String firstName;

    @Column(name = "description", length = 1000,nullable = true)
    private String lastName;

    @Column(name = "email", length = 30,nullable = true)
    private String email;

    @Column(name = "password", length = 10,nullable = true)
    private String password;

    @OneToOne
    private Role roles;


    String encrypt(String password) {
        //TODO:encrypt logic
        return null;
    }
}
