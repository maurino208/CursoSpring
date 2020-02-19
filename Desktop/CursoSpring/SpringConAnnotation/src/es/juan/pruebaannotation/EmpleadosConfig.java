package es.juan.pruebaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.juan.pruebaannotation")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	//definir bean para informe financiero depto compras
	
	@Bean
	public CreacionInformeFinanciero informe() {
		return new InformeFinancieroDeptoCompras();
	}
	
	//definir el bean para el director financiero
	
	@Bean
	public Empleados directorFinanciero() { 
		return new DirectorFinanciero(informe());
	}
}
