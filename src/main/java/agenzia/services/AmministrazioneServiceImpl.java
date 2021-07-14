package agenzia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import agenzia.entities.Cliente;
import agenzia.entities.Viaggio;
import agenzia.repos.ClienteDAO;

@Service
public class AmministrazioneServiceImpl implements AmministrazioneService {

	@Autowired
	private ClienteDAO repo;
	
	
	
	
	@Override
	public Cliente trovaCliente(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Cliente modificaCliente(Cliente c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public void eliminaCliente(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void creaCliente(Cliente c) {
		// TODO Auto-generated method stub
		repo.save(c);
	}

	@Override
	public List<Cliente> trovaTuttiClienti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
		
	

}
