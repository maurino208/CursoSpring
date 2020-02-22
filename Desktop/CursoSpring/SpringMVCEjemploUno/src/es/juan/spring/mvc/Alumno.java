package es.juan.spring.mvc;

import javax.validation.constraints.*;


public class Alumno {
	
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String nombre;
	@NotNull
	@Size(min=2, message="Campo requerido")
	private String apellido;
	private String optativa, ciudadEstudios, idiomaEstudio;
	@Email
	private String email;
	@Min(value=18, message="Usted es menor")
	@Max(value=80, message="Usted es mayor")
	private int edad;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	
	
	public String getOptativa() {
		return optativa;
	}
	
	public void setOptativa(String optativa) {
		this.optativa=optativa;
	}
	
	
	
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios=ciudadEstudios;
	}
	
	
	
	public String getIdiomaEstudio() {
		return idiomaEstudio;
	}

	public void setIdiomaEstudio(String idiomaEstudio) {
		this.idiomaEstudio=idiomaEstudio;
	}
}
