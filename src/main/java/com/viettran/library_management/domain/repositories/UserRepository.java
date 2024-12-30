package com.viettran.library_management.domain.repositories;

import com.viettran.library_management.domain.models.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(String userId);
    void save(User user);
    void delete(String userId);
}