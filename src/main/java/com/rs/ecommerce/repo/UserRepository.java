package com.rs.ecommerce.repo;

import com.rs.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Optional<User> findByEmail(String email);

    //Optional<User> findByUsernameOrEmail(String username, String email);

    //Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);
    Boolean existsByPasswordAndAndEmail(String password, String Email);
}
