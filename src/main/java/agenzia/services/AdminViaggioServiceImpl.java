package agenzia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import agenzia.entities.Viaggio;
import agenzia.repos.ViaggioDAO;

public class AdminViaggioServiceImpl implements AdminViaggioService {

	@Autowired
	private ViaggioDAO vrepo;
	
	@Override
	public Viaggio trovaViaggio(int id) {
		// TODO Auto-generated method stub
		return vrepo.findById(id).get();
	}

	@Override
	public Viaggio modificaViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return vrepo.save(v);
	}

	@Override
	public Viaggio creaViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return vrepo.save(v);
	}

	@Override
	public void eliminaViaggio(int id) {
		// TODO Auto-generated method stub
		vrepo.deleteById(id);
	}

	@Override
	public List<Viaggio> trovaTuttiViaggi() {
		// TODO Auto-generated method stub
		return vrepo.findAll();
	}

	

}
