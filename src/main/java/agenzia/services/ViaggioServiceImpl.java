package agenzia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import agenzia.entities.Viaggio;
import agenzia.repos.ViaggioDAO;

@Service
public class ViaggioServiceImpl implements ViaggioService{

	@Autowired
	private ViaggioDAO repo;
	
	@Override
	public Viaggio creaViaggio(Viaggio viaggio) {
		return repo.save(viaggio);
	}

	@Override
	public Viaggio trovaViaggio(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Viaggio> trovaTuttiViaggi() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Viaggio modificaViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaViaggio(int id) {
		// TODO Auto-generated method stub
		
	}

}
