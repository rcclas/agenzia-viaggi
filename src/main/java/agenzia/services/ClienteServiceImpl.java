package agenzia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import agenzia.entities.Cliente;
import agenzia.repos.ClienteDAO;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDAO repo;
	
	@Override
	public Cliente creaCliente(Cliente cliente) {
		return repo.save(cliente);
	}

	@Override
	public Cliente trovaCliente(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Cliente> trovaTuttiClienti() {
		return repo.findAll();
	}

	@Override
	public Cliente modificaCliente(Cliente cliente) {
		return repo.save(cliente);
	}

	@Override
	public void eliminaCliente(int id) {
		repo.deleteById(id);
	}

}
