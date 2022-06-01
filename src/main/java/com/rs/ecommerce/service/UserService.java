package com.rs.ecommerce.service;

import com.rs.ecommerce.model.UserDTO;
import com.rs.ecommerce.model.UserLoginDTO;
import org.springframework.http.HttpStatus;

public interface UserService {

    public UserDTO createUser(UserDTO userDTO) throws Exception;

    public String loginUser(UserLoginDTO userLoginDTO) throws Exception;
}
