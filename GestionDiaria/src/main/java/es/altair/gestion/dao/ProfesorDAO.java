package es.altair.gestion.dao;

import es.altair.gestion.bean.Profesor;

public interface ProfesorDAO {

	public void guardar(Profesor p);
	
	public void eliminar(Profesor p);
	
	public Profesor obtener(int id);
	
	public void editar(Profesor p);
	
	
}
