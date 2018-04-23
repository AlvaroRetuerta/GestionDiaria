package es.altair.gestion.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.altair.gestion.bean.Asignatura;

@Repository
public class AsignaturaDAOImplHibernate implements AsignaturaDAO {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void guardar(Asignatura a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.save(a);
		
	}

	@Override
	@Transactional
	public void eliminar(Asignatura a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(a);
		
	}

	@Override
	@Transactional
	public Asignatura obtener(int id) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Asignatura)sesion.get(Asignatura.class,id);
	}

	@Override
	@Transactional
	public void editar(Asignatura a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(a);
		
	}
}
