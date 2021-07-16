package agenzia.integration;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenzia.entities.Cliente;
import agenzia.services.ClienteService;

@RestController
@RequestMapping("/api/clienti")
public class ClientiRestCtrl {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/tutti")
	List<Cliente> tutti(){
		return service.trovaTuttiClienti();
	}

	@GetMapping("/pagamento/{id}")
	Cliente trovaUno(@PathVariable("id") int id){ 
		return service.trovaCliente(id);
	}

	@GetMapping("/{id}")
	Cliente trovaViaggio(@PathVariable("id") int id) {
		return service.trovaCliente(id);
	}

	
}
