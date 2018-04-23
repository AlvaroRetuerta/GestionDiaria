package es.altair.gestion.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profesores")
public class Profesor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProfesor;
	private String nombre;
	private String apellidos;
	private String email;
	private int tipo_usuario;
	private String password;
	
	public Profesor(String nombre, String apellidos, String email, int tipo_usuario, String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.tipo_usuario = tipo_usuario;
		this.password = password;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", tipo_usuario=" + tipo_usuario + ", password=" + password + "]";
	}

	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
