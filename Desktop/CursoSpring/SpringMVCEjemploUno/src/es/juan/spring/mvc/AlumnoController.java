package es.juan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
	
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		
		return "AlumnoRegistroFormulario";	
	}
	
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("alumno") Alumno alumno) {
		
		return "confirmacionRegistro";
		
	}

}
