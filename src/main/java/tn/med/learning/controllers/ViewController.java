package tn.med.learning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tn.med.learning.services.InventoryService;
import tn.med.learning.services.ProductService;

@Controller
public class ViewController {
	private ProductService productService;
	private InventoryService inventoryService;
	
	@Autowired
	public ViewController(ProductService productService, InventoryService inventoryService) {
		this.productService = productService;
		this.inventoryService = inventoryService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/products")
	public String products(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@GetMapping("/inventories")
	public String inventories(Model model) {
		model.addAttribute("inventories", inventoryService.getAllInventories());
		return "inventories";
	}
	
}
