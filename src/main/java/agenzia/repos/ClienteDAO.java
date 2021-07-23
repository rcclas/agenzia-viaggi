package agenzia.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import agenzia.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

	Optional<Cliente> findByEmail(String email);
	}
