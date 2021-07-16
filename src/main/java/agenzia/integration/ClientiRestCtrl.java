package agenzia.integration;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenzia.entities.Cliente;
import agenzia.services.ClienteService;

@RestController
@RequestMapping("/api/clienti")
public class ClientiRestCtrl {

	@Autowired
	private ClienteService service;

	@PostMapping(value = "/aggiungi", consumes = "application/json")
	Cliente aggiungiCliente(@RequestBody Cliente cliente) {
		return service.creaCliente(cliente);
	}
	
	@GetMapping("/{id}")
	Cliente trovaViaggio(@PathVariable("id") int id) {
		return service.trovaCliente(id);
	}

	@GetMapping("/tutti")
	List<Cliente> tutti(){
		return service.trovaTuttiClienti();
	}
	
	@PutMapping(value = "/modifica", consumes = "application/json")
	Cliente modificaCliente(@RequestBody Cliente cliente) {
		return service.creaCliente(cliente);
	}
	
	@DeleteMapping(value = "/elimina", consumes = "application/json")
	void cancellaCliente(@RequestBody int id) {
		service.eliminaCliente(id);
	}
}
