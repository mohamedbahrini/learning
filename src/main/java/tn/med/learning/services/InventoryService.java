package tn.med.learning.services;

import java.util.List;
import java.util.Optional;

import tn.med.learning.models.Inventory;

public interface InventoryService {
	Optional<Inventory> getByName(String name);
	void saveInventory(Inventory inventory);
	List<Inventory> getAllInventories();
}
