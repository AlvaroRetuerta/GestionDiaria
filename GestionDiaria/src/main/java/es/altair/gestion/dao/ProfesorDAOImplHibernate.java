package es.altair.gestion.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.altair.gestion.bean.Profesor;

@Repository
public class ProfesorDAOImplHibernate implements ProfesorDAO {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void guardar(Profesor p) {
		
		Session sesion = sessionFactory.getCurrentSession();
		sesion.save(p);
		
	}

	@Override
	@Transactional
	public void eliminar(Profesor p) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(p);
		
	}

	@Override
	@Transactional
	public Profesor obtener(int id) {
		Session sesion = sessionFactory.getCurrentSession();
		
		return (Profesor)sesion.get(Profesor.class, id);
	}

	@Override
	@Transactional
	public void editar(Profesor p) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(p);
		
	}
}
