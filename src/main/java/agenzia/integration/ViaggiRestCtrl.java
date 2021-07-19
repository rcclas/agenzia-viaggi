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

import agenzia.entities.Viaggio;
import agenzia.services.ViaggioService;

@RestController
@RequestMapping("/api/viaggi")
public class ViaggiRestCtrl {

	@Autowired
	private ViaggioService service;
	
	@PostMapping(value = "/aggiungi", consumes = "application/json")
	public Viaggio aggiungiViaggio(@RequestBody Viaggio viaggio) {
		return service.creaViaggio(viaggio);
	}
	
	@GetMapping("/{id}")
	public Viaggio trovaViaggio(@PathVariable("id") int id) {
		return service.trovaViaggio(id);
	}
	
	@GetMapping("/tutti")
	public List<Viaggio> tutti(){
		return service.trovaTuttiViaggi();
	}
	
	@PutMapping(value = "/modifica", consumes = "application/json")
	public Viaggio modificaViaggio(@RequestBody Viaggio viaggio) {
		return service.modificaViaggio(viaggio);
	}
	
	@DeleteMapping(value = "/elimina", consumes = "application/json")
	public void cancellaViaggio(@RequestBody int id) {
		service.eliminaViaggio(id);
	}


	
}
