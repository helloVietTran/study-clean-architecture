package com.viettran.library_management.infrastructure.repositories;

import com.viettran.library_management.domain.models.Inventory;
import com.viettran.library_management.domain.repositories.InventoryRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Optional;

public class InventoryRepositoryImpl implements InventoryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Inventory> findById(String inventoryId) {
        Inventory inventory = entityManager.find(Inventory.class, inventoryId);
        return Optional.ofNullable(inventory);
    }

    @Override
    public void save(Inventory inventory) {
        entityManager.persist(inventory);
    }

    @Override
    public void delete(String inventoryId) {
        Inventory inventory = entityManager.find(Inventory.class, inventoryId);
        if (inventory != null) {
            entityManager.remove(inventory);
        }
    }
}
