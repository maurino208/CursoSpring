package es.juan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Controlador {
	
	@RequestMapping
	public String muestraPagina(){
		return "MVCEjemplo";
	}

}