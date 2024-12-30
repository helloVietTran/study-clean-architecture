package com.viettran.library_management.domain.repositories;

import com.viettran.library_management.domain.models.Inventory;

import java.util.Optional;

public interface InventoryRepository {
    Optional<Inventory> findById(String inventoryId);
    void save(Inventory inventory);
    void delete(String inventoryId);
}
