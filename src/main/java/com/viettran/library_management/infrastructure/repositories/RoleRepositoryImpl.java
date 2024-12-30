package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Role;
import com.viettran.library_management.domain.repositories.RoleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Role> findById(String roleId) {
        Role role = entityManager.find(Role.class, roleId);
        return Optional.ofNullable(role);
    }

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void delete(String roleId) {
        Role role = entityManager.find(Role.class, roleId);
        if (role != null) {
            entityManager.remove(role);
        }
    }
}
