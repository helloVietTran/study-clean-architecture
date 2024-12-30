package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Borrow;
import com.viettran.library_management.domain.repositories.BorrowRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BorrowRepositoryImpl implements BorrowRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Borrow> findById(String borrowId) {
        Borrow borrow = entityManager.find(Borrow.class, borrowId);
        return Optional.ofNullable(borrow);
    }

    @Override
    public void save(Borrow borrow) {
        entityManager.persist(borrow);
    }

    @Override
    public void delete(String borrowId) {
        Borrow borrow = entityManager.find(Borrow.class, borrowId);
        if (borrow != null) {
            entityManager.remove(borrow);
        }
    }
}
