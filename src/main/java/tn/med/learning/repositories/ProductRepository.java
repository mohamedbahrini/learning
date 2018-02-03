package tn.med.learning.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.med.learning.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	Optional<Product> findByName(String name);
}
