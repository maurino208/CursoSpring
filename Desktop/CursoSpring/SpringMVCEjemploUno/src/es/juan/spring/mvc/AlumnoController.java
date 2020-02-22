package es.juan.spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {//recorta los espacion en blanco de los strings
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
	
		Alumno alumno = new Alumno();
		modelo.addAttribute("alumno", alumno);
		
		return "AlumnoRegistroFormulario";	
	}
	
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("alumno") Alumno alumno, BindingResult resultado) {
		
		if(resultado.hasErrors()) {
			return "AlumnoRegistroFormulario";
		}
		else {
			return "confirmacionRegistro";
		}
	}

}
