package tn.med.learning.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import tn.med.learning.models.Product;
import tn.med.learning.repositories.ProductRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {
	@Mock
	private ProductRepository productRepository;
	@InjectMocks
	private ProductServiceImpl productServiceImpl;
	@Before
	public void setUp() {
		Product product = new Product();
		product.setName("name");
		product.setPrice("price");
		when(productRepository.findByName(Mockito.anyString())).thenReturn(Optional.of(product));
	}
	@Test
	public void getProductByName() {
		assertEquals("name", productServiceImpl.getProductByName("ss").get().getName());
	}
}
