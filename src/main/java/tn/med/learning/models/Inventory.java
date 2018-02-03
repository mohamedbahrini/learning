package tn.med.learning.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long space;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "inventory_product", joinColumns = { @JoinColumn(name = "inventory_id") }, inverseJoinColumns = {
			@JoinColumn(name = "product_id") })
	private Set<Product> products = new HashSet<>();
	@OneToOne
	private Adress adress;
}
