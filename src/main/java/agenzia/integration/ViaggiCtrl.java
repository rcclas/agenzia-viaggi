package agenzia.integration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViaggiCtrl {
	
	@GetMapping("/viaggio/{id}")
	public String getViaggio(@PathVariable int id, Model m) {
		m.addAttribute("viaggio", id);
		return "pagamento";
		
	}

}
