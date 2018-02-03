package tn.med.learning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.med.learning.models.Inventory;
import tn.med.learning.repositories.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {
	private InventoryRepository inventoryRepository;
	
	@Autowired
	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}
	@Override
	public Optional<Inventory> getByName(String name) {
		return inventoryRepository.findByName(name);
	}

	@Override
	public void saveInventory(Inventory inventory) {
		inventoryRepository.save(inventory);		
	}
	@Override
	public List<Inventory> getAllInventories() {
		return (List<Inventory>) inventoryRepository.findAll();
	}

}
