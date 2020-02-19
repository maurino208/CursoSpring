package es.juan.pruebaannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotationDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		//leer el class de config
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		Empleados empleado = context.getBean("directorFinanciero", Empleados.class);
		DirectorFinanciero director = context.getBean("directorFinanciero", DirectorFinanciero.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		System.out.println(director.getEmail());
		System.out.println(director.getnombreEmpresa());
		
		
		context.close();

	}

}
