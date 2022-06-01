package com.rs.ecommerce.model;

import com.rs.ecommerce.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role roles;

    public UserDTO(String firstName, String lastName, String email, String password, Role roles) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.roles=roles;
    }

    public UserDTO(String email, String password) {
        this.email=email;
        this.password=password;
    }

    public UserDTO(String email, String firstName, String lastName, Role roles) {
    }
}
