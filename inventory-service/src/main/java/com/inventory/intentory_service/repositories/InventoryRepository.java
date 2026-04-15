package com.inventory.intentory_service.repositories;

import com.inventory.intentory_service.entities.Inventory;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {
  Optional<Inventory> findByProductId(String productId);
}
