package agenzia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import agenzia.entities.Viaggio;
import agenzia.repos.ViaggioDAO;

@Service
public class ClienteViaggioServiceImpl implements ClienteViaggioService {

	@Autowired 
	private ViaggioDAO vrepo;
	
	
	@Override
	public Viaggio trovaViaggio(int id) {
		// TODO Auto-generated method stub
		return vrepo.findById(id).get();
	}

	@Override
	public List<Viaggio> trovaTuttiViaggi() {
		// TODO Auto-generated method stub
		return vrepo.findAll();
	}

	@Override
	public void eliminaPrenotazione(int id) {
		// TODO Auto-generated method stub
		vrepo.deleteById(id);
	}

}
