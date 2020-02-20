package es.juan.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador2 {
	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() { //proporciona el formulario
		return "Formulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "FormularioSpring";
	}
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		String nombre=request.getParameter("nombreAlumno");
		nombre+=" es el mejor alumno";
		String mensajeFinal="Quien es el mejor alumno? " + nombre;
		//agregando info al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		return "FormularioSpring";
		
	}
}
