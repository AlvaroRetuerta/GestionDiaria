package es.altair.gestion.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notas")
public class Nota {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNota;
	@ManyToOne
	@JoinColumn(name="idProfesor")
	private Profesor profesor;
	@ManyToOne
	@JoinColumn(name="idAsignatura")
	private Asignatura asignatura;
	@ManyToOne
	@JoinColumn(name="idAlumno")
	private Alumno alumno;
	private int idTipo;
	private Date fecha;
	private int evaluacion;
	private String valor;
	
	
	
	
	
	public Nota(Profesor profesor, Asignatura asignatura, Alumno alumno, int idTipo, Date fecha, int evaluacion,
			String valor) {
		super();
		this.profesor = profesor;
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.idTipo = idTipo;
		this.fecha = fecha;
		this.evaluacion = evaluacion;
		this.valor = valor;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public int getIdNota() {
		return idNota;
	}

	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nota [idNota=" + idNota + ", profesor=" + profesor + ", asignatura=" + asignatura + ", alumno=" + alumno
				+ ", idTipo=" + idTipo + ", fecha=" + fecha + ", evaluacion=" + evaluacion + ", valor=" + valor + "]";
	}

	public Nota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
