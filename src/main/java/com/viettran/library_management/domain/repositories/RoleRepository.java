package com.viettran.library_management.domain.repositories;

import com.viettran.library_management.domain.models.Role;

import java.util.Optional;

public interface RoleRepository {

    Optional<Role> findById(String roleId);
    void save(Role role);
    void delete(String roleId);
}
