package com.evgeniypodprugin.spring_rest_jm.service;

import com.evgeniypodprugin.spring_rest_jm.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    void createUser(User user);

    Iterable<User> getAllUsers();

    void updateUser(User user);

    void deleteUser(User user);

    Optional<User> getUserById(Long id);

    void deleteUserById(Long id);

    User getUserByEmail(String email);

}
