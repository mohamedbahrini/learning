package tn.med.learning.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.med.learning.models.Adress;

public interface AdressRepository extends CrudRepository<Adress, Long> {
	Optional<Adress> findByEmail(String email);
}
