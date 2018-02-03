package tn.med.learning.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.med.learning.models.Inventory;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {
	Optional<Inventory> findByName(String name);
}
