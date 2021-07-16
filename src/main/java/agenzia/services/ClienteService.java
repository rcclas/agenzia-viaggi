package agenzia.services;

import java.util.List;
import agenzia.entities.Cliente;

public interface ClienteService {
	
	Cliente creaCliente(Cliente c);
	Cliente trovaCliente(int id);
	List<Cliente> trovaTuttiClienti();
	Cliente modificaCliente(Cliente c);
	void eliminaCliente(int id);
}
