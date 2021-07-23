package agenzia.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import agenzia.entities.Cliente;
import agenzia.services.ClienteService;
import agenzia.services.ViaggioService;

@Controller
public class ViaggiCtrl {
	
	@Autowired 
	private ViaggioService vs;
	
	
	@Autowired
	private ClienteService cs;
	
	@GetMapping("/viaggio/{id}")
	public String getViaggio(@PathVariable int id, Model model) {
		model.addAttribute("viaggio", vs.trovaViaggio(id));
		return "pagamento";
	}
	
	
	@PostMapping(value = "/conferma/{idViaggio}")
	public String confermaAcquisto(@ModelAttribute Cliente cliente, Model model, @PathVariable int idViaggio) {
		Cliente c = cs.trovaClienteByEmail(cliente.getEmail());
		c = (c == null)?cs.creaCliente(cliente):c;
		model.addAttribute("cliente", c);
		model.addAttribute("viaggio", vs.trovaViaggio(idViaggio));
		return "conferma";
	}
}
