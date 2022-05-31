package com.rs.ecommerce.model.DTO;

import com.rs.ecommerce.model.Role;
import com.rs.ecommerce.model.User;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Mapper {

    public UserDTO toDTO(User user){
         String email = user.getEmail();
         String firstName = user.getFirstName();
         String lastName = user.getLastName();
         Role roles = user.getRoles();

         return new UserDTO(email, firstName, lastName, roles);
    }

    public User toUser(UserCreationDTO userDTO) {
        return new User(userDTO.getFirstName(), userDTO.getLastName(), userDTO.getEmail(), userDTO.getPassword(), userDTO.getRoles());
    }

    public User toUser(UserLoginDTO userDTO){
        return new User(userDTO.getEmail(), userDTO.getPassword());
    }
}
