package agenzia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenzia.entities.Viaggio;
import agenzia.services.ViaggioService;

@RestController
@RequestMapping("/api/viaggi")
public class ViaggiRestCtrl {

	@Autowired
	private ViaggioService viaggio;
	
	@GetMapping("/tutti")
	List<Viaggio> tutti(){
		return viaggio.trovaTuttiViaggi();
	}

	@GetMapping("/pagamento/{id}")
	Viaggio trovaUno(@PathVariable("id") int id){ 
		return viaggio.trovaViaggio(id);
	}

	@GetMapping("/{id}")
	Viaggio trovaViaggio(@PathVariable("id") int id) {
		return viaggio.trovaViaggio(id);
	}

	
}
