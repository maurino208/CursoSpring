package es.juan.pruebaannotation;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	private CreacionInformeFinanciero nuevoInforme;
	@Value("${email}")
	private String Email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	public DirectorFinanciero(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Director del departamento de compras";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}
	
	public String getEmail() {
		return Email;
	}
	
	public String getnombreEmpresa() {
		return nombreEmpresa;
	}

}
