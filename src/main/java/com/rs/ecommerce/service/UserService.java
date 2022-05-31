package com.rs.ecommerce.service;

import com.rs.ecommerce.model.DTO.UserDTO;
import com.rs.ecommerce.model.User;

public interface UserService {

    public UserDTO createUser(User userCreationDTO);
}
