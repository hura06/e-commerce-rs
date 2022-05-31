package com.rs.ecommerce.controller;


import com.rs.ecommerce.model.DTO.Mapper;
import com.rs.ecommerce.model.DTO.UserCreationDTO;
import com.rs.ecommerce.model.DTO.UserDTO;
import com.rs.ecommerce.model.DTO.UserLoginDTO;
import com.rs.ecommerce.model.User;
import com.rs.ecommerce.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private final UserService userService;
    private com.rs.ecommerce.model.DTO.Mapper mapper;

    public UserController(UserService userService, Mapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<UserDTO> createUser(@RequestBody UserCreationDTO userCreationDTO){
        User user = mapper.toUser(userCreationDTO);
        return ResponseEntity.ok(userService.createUser(user));
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserLoginDTO userLoginDTO){
        User user = mapper.toUser(userLoginDTO);
        return ResponseEntity.ok()
    }
}
