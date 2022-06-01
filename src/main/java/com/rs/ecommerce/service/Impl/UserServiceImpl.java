package com.rs.ecommerce.service.Impl;


import com.rs.ecommerce.entity.User;
import com.rs.ecommerce.exception.ExceptionResponse;
import com.rs.ecommerce.exception.IMExceptionHandler;
import com.rs.ecommerce.model.UserDTO;
import com.rs.ecommerce.model.UserLoginDTO;
import com.rs.ecommerce.repo.UserRepository;
import com.rs.ecommerce.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;


    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) throws Exception {

        User userEntity = modelMapper.map(userDTO, User.class);

        if (userRepository.existsByEmail(userDTO.getEmail())) {
            //TODO: exception paketi altında hatalar implement edilcek.
            throw new Exception("Mailinizi sisteme kayıtlı");
        } else {
            userEntity = userRepository.save(userEntity);
            return userDTO;
        }
    }


    @Override
    public String loginUser(UserLoginDTO userLoginDTO) throws Exception {
        User userEntity = modelMapper.map(userLoginDTO, User.class);
        // return userRepository.existsByEmail(userLoginDTO.getEmail())

        if (userRepository.existsByEmail(userLoginDTO.getEmail())) {
            if (userRepository.existsByPasswordAndAndEmail(userLoginDTO.getPassword(), userLoginDTO.getEmail())) {
                // http durumlarını değiştirmek istiyorum.
                return "Sign in Succesfull";
            } else {
                throw new Exception("Parola yanlış");
            }

        } else {
            throw new Exception("Mail adresiniz yanlış");
        }


    }

}

