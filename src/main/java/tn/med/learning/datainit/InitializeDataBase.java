package tn.med.learning.datainit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tn.med.learning.models.Product;
import tn.med.learning.services.ProductService;

@Component
public class InitializeDataBase implements CommandLineRunner {
	private ProductService productService;
	
	@Autowired
	public InitializeDataBase(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setName("init");
		product.setPrice("init");
		productService.saveProduct(product);
	}

}
