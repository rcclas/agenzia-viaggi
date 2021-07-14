package agenzia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import agenzia.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
