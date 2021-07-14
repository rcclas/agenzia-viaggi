package agenzia.services;

import java.util.List;

import agenzia.entities.Viaggio;

public interface AdminViaggioService {

	Viaggio trovaViaggio(int id);
	Viaggio modificaViaggio(Viaggio v);
	Viaggio creaViaggio(Viaggio v);
	void eliminaViaggio(int id);
	List<Viaggio> trovaTuttiViaggi();
//	void eliminaPrenotazione(int id);
}
