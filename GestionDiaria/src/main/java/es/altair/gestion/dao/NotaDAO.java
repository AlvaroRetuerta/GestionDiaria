package es.altair.gestion.dao;

import es.altair.gestion.bean.Nota;

public interface NotaDAO {

	
	public void guardar(Nota n);
	
	public void eliminar(Nota n);
	
	public Nota obtener(int id);
	
	public void editar(Nota n);
}
