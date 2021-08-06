package com.evgeniypodprugin.spring_rest_jm.repository;

import com.evgeniypodprugin.spring_rest_jm.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);

    User findByEmail(String email);

    void deleteById(Long id);
}
