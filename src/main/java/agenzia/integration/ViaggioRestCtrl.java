package agenzia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenzia.entities.Viaggio;
import agenzia.services.ClienteViaggioService;

@RestController
@RequestMapping("/api/viaggi")

public class ViaggioRestCtrl {

	@Autowired
	private ClienteViaggioService vs;
	
	@GetMapping("")
	List<Viaggio> tutti(){
		return vs.trovaTuttiViaggi();
	}
	
	
	
}
