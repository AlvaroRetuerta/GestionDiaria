package es.altair.gestion.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.altair.gestion.bean.Nota;

@Repository
public class NotaDAOImplHibernate implements NotaDAO {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public void guardar(Nota n) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.save(n);
		
	}

	@Override
	@Transactional
	public void eliminar(Nota n) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.delete(n);
		
	}

	@Override
	@Transactional
	public Nota obtener(int id) {
		Session sesion = sessionFactory.getCurrentSession();
		return (Nota)sesion.get(Nota.class, id);
	}

	@Override
	@Transactional
	public void editar(Nota n) {
		Session sesion = sessionFactory.getCurrentSession();
		sesion.update(n);
		
	}
}
