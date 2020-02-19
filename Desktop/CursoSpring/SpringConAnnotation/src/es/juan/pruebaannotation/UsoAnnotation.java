package es.juan.pruebaannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation {

	public static void main(String[] args) {
		// Leer el xml de configuracion
			
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
			
		//Pedir un bean al contenedor
		
		Empleados Juan = context.getBean("ComercialExperimentado", Empleados.class);
		
		//Usar el bean
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		
		//Cerrar el contexto
		context.close();
	}

}
