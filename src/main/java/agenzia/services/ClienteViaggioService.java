package agenzia.services;

import java.util.List;

import agenzia.entities.Viaggio;

public interface ClienteViaggioService {

	Viaggio trovaViaggio(int id);
	List<Viaggio> trovaTuttiViaggi();
	void eliminaPrenotazione(int id);
	//TODO modifica prenotazione
	//TODO add prenotazione
	//TODO trova prenotazione
}
