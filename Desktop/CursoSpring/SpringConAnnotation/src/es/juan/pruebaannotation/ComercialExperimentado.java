package es.juan.pruebaannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados {
	
	//ejecución de codigo despues de creacion de bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion de bean");
	}
	
	//ejecucion de codigo despues de apagado de bean
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destrucción del bean");
	}
	
	@Autowired
	@Qualifier("informeFinancieronTrimCuatro") // bean id
	private CreacionInformeFinanciero nuevoInforme;

	/*@Autowired
	public ComercialExperimentado (CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	}*/
	
	/*@Autowired
	public void getInformeFinancieron(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme=nuevoInforme;
	}*/

	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender";
	}
	
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Esto es un informe generado por el Comercial Experimentado";
		return nuevoInforme.getInformeFinanciero();
	}

	

}
