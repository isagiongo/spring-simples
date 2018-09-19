package br.com.isagiongo.springsimples;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		Boolean validation = false;
		List<String> lista = Arrays.asList("Marina Silva", "Isa Giongo", "Maria Antonieta", "Manuela Dávila");
		model.addAttribute("validation", false);
		model.addAttribute("list", lista);
		
		return "index";
	}
}
