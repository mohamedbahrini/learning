package tn.med.learning.services;

import java.util.List;
import java.util.Optional;

import tn.med.learning.models.Product;

public interface ProductService {
	Optional<Product> getProductByName(String name);
	void saveProduct(Product product);
	List<Product> getAllProducts();
}
