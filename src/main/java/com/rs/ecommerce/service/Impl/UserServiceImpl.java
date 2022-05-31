package com.rs.ecommerce.service.Impl;


import com.rs.ecommerce.model.DTO.UserDTO;
import com.rs.ecommerce.model.User;
import com.rs.ecommerce.repo.UserRepository;
import com.rs.ecommerce.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(User userCreationDTO) {
        userRepository.save(userCreationDTO);
        return new UserDTO(userCreationDTO.getEmail(), userCreationDTO.getFirstName(),userCreationDTO.getLastName(), userCreationDTO.getRoles());
    }
}
