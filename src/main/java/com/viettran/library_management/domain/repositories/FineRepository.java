package com.viettran.library_management.domain.repositories;

import com.viettran.library_management.domain.models.Fine;

import java.util.Optional;

public interface FineRepository {

    Optional<Fine> findById(String fineId);
    void save(Fine fine);
    void delete(String fineId);
}