package es.altair.gestion.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.altair.gestion.bean.Alumno;

@Repository
public class AlumnoDAOImplHibernate implements AlumnoDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void guardar(Alumno a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.save(a);

	}

	@Override
	@Transactional
	public void eliminar(Alumno a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(a);

	}

	@Override
	@Transactional
	public Alumno obtener(int id) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Alumno) sesion.get(Alumno.class, id);
	}

	@Override
	@Transactional
	public void editar(Alumno a) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(a);

	}
}
