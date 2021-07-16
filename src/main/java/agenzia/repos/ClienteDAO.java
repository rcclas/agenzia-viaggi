package agenzia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import agenzia.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {}
