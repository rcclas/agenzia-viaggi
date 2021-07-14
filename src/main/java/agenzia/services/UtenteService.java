package agenzia.services;

import java.util.List;

import agenzia.entities.Cliente;
import agenzia.entities.Viaggio;

public interface UtenteService {
	
	Cliente trovaCliente(int id);
	Cliente modificaCliente(Cliente c);
	void eliminaCliente(int id);
	void creaCliente(Cliente c);
	
	
}
