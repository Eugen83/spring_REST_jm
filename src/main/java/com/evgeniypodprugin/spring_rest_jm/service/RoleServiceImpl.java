package com.evgeniypodprugin.spring_rest_jm.service;

import com.evgeniypodprugin.spring_rest_jm.model.Role;
import com.evgeniypodprugin.spring_rest_jm.repository.RoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void createRole(Set<Role> roles) {
        roleRepository.saveAll(roles);
    }

    @Override
    public Set<Role> getAllRoles() {
        Iterable<Role> iterable = roleRepository.findAll();
        Set<Role> set = new HashSet<>();
        iterable.forEach(role -> set.add(role));
        return set;
    }
}
