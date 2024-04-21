package Propuesta_de_ejercicio_02;
import java.io.Serializable;

public class Alumno implements Serializable {

	private static final long seriaLVersionUID = 1L;
	
	private Long id;
	private String nombre;
	
	public Alumno (Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;

	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void getNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno{" +
				"id=" + id +
				", nombre='" + nombre+ '\"'+
				'}';
	}

}
