package com.rs.ecommerce.model;

import com.sun.xml.bind.v2.TODO;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @OneToOne
    private Role roles;




    String encrypt(String password) {
        //TODO:encrypt logic
        return null;
    }
}
