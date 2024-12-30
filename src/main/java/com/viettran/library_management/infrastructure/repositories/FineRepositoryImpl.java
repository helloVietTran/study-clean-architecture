package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Fine;
import com.viettran.library_management.domain.repositories.FineRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class FineRepositoryImpl implements FineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Fine> findById(String fineId) {
        Fine fine = entityManager.find(Fine.class, fineId);
        return Optional.ofNullable(fine);
    }

    @Override
    public void save(Fine fine) {
        entityManager.persist(fine);
    }

    @Override
    public void delete(String fineId) {
        Fine fine = entityManager.find(Fine.class, fineId);
        if (fine != null) {
            entityManager.remove(fine);
        }
    }
}
