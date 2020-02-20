package es.juan.spring.mvc;

public class Alumno {
	
	private String nombre, apellido, optativa, ciudadEstudios, idiomaEstudio;
	
	
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
