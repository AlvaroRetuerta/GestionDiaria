package es.altair.gestion.dao;

import es.altair.gestion.bean.Asignatura;

public interface AsignaturaDAO {

	
	public void guardar(Asignatura a);
	
	public void eliminar(Asignatura a);
	
	public Asignatura obtener(int id);
	
	public void editar(Asignatura a);
	
}
