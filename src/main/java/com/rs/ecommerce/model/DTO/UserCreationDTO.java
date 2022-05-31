package com.rs.ecommerce.model.DTO;

import com.rs.ecommerce.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserCreationDTO  {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role roles;
}
