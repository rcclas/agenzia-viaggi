package agenzia.services;

import java.util.List;

import agenzia.entities.Cliente;
import agenzia.entities.Viaggio;

public interface AmministrazioneService {

	Cliente trovaCliente(int id);
	Cliente modificaCliente(Cliente c);
	void eliminaCliente(int id);
	void creaCliente(Cliente c);
	List<Cliente> trovaTuttiClienti();
	
	
	
	//TODO modifica prenotazione
	//TODO add prenotazione
	//TODO trova prenotazione
	//TODO trova tutte le prenotazioni
	
}
