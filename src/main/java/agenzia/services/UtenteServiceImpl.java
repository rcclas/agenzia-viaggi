package agenzia.services;

import org.springframework.beans.factory.annotation.Autowired;

import agenzia.entities.Cliente;
import agenzia.repos.ClienteDAO;

public class UtenteServiceImpl implements UtenteService {

	@Autowired
	private ClienteDAO repos;
	
	@Override
	public Cliente trovaCliente(int id) {
		// TODO Auto-generated method stub
		return repos.findById(id).get();
	}

	@Override
	public Cliente modificaCliente(Cliente c) {
		// TODO Auto-generated method stub
		return repos.save(c);
	}

	@Override
	public void eliminaCliente(int id) {
		// TODO Auto-generated method stub
		repos.deleteById(id);
	}

	@Override
	public void creaCliente(Cliente c) {
		// TODO Auto-generated method stub
		repos.save(c);
	}

}
