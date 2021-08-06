package com.evgeniypodprugin.spring_rest_jm.service;

import com.evgeniypodprugin.spring_rest_jm.model.Role;

import java.util.Set;

public interface RoleService {
    void createRole(Set <Role> roles);
    Set<Role> getAllRoles();
}
