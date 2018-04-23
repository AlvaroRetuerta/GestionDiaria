package es.altair.gestion.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignaturas")
public class Asignatura {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAsignatura;
	private String nombre;
	private String alias;
	@ManyToOne
	@JoinColumn(name="idProfesor")
	private Profesor profesor;
	
	
	
	public Asignatura(String nombre, String alias, Profesor profesor) {
		super();
		this.nombre = nombre;
		this.alias = alias;
		this.profesor = profesor;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	@Override
	public String toString() {
		return "Asignatura [idAsignatura=" + idAsignatura + ", nombre=" + nombre + ", alias=" + alias + ", profesor="
				+ profesor + "]";
	}
	public Asignatura() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
