package es.altair.gestion.dao;

import es.altair.gestion.bean.Alumno;

public interface AlumnoDAO {

	
	public void guardar(Alumno a);
	
	public void eliminar(Alumno a);
	
	public Alumno obtener(int id);
	
	public void editar(Alumno a);
}
