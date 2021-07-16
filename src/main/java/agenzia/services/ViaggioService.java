package agenzia.services;

import java.util.List;

import agenzia.entities.Viaggio;

public interface ViaggioService {
	
	Viaggio creaViaggio(Viaggio v);
	Viaggio trovaViaggio(int id);
	List<Viaggio> trovaTuttiViaggi();
	Viaggio modificaViaggio(Viaggio v);
	void eliminaViaggio(int id);
}
