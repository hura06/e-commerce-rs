package com.rs.ecommerce.controller;


import com.rs.ecommerce.model.UserDTO;
import com.rs.ecommerce.model.UserLoginDTO;
import com.rs.ecommerce.repo.UserRepository;
import com.rs.ecommerce.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) throws Exception {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<String> loginUser(@RequestBody UserLoginDTO userLoginDTO) throws Exception {

        return ResponseEntity.ok(userService.loginUser(userLoginDTO));

    }
}
/*

@PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
 */