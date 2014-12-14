package br.com.wpattern.northwind.database.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import br.com.wpattern.northwind.database.utils.interfaces.IGenericDao;


/**
 * Generic dao used to access the database.
 *
 * @author augusto
 *
 * @param <T>
 * @param <ID>
 */
public abstract class GenericDao<T extends BaseEntity, ID extends Serializable> implements IGenericDao<T, ID> {

	/**
	 * Logger.
	 */
	private final Logger logger = Logger.getLogger(this.getClass());

	/**
	 * Used to retrieve information about a class (entity).
	 */
	private final Class<T> persistentClass;

	/**
	 * Session with the database.
	 */
	private Session session;

	// ///////////////////////////////////////////////////////////////////////////////
	// CONSTRUCTORS
	// ///////////////////////////////////////////////////////////////////////////////

	@SuppressWarnings("unchecked")
	public GenericDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		this.session = this.getCurrentSession();

		if (this.logger.isInfoEnabled()) {
			this.logger.info(String.format("Creating a dao to the persitence class [%s].", this.getPersistentClass()));
		}
	}

	// ///////////////////////////////////////////////////////////////////////////////
	// PUBLIC METHODS (IGenericDao<T, ID>)
	// ///////////////////////////////////////////////////////////////////////////////

	@Override
	@SuppressWarnings("unchecked")
	public T findById(ID id) {
		return (T) this.getSession().load(this.getPersistentClass(), id);
	}

	@Override
	public List<T> findAll() {
		return this.findByCriteria();
	}

	@Override
	@SuppressWarnings("unchecked")
	public ID save(T entity) {
		this.getSession().beginTransaction();
		Serializable id = this.getSession().save(entity);
		this.getSession().getTransaction().commit();

		return (ID)id;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(T entity) {
		entity = (T)this.getSession().merge(entity);

		this.getSession().beginTransaction();
		this.getSession().update(entity);
		this.getSession().getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(T entity) {
		entity = (T)this.getSession().merge(entity);

		this.getSession().beginTransaction();
		this.getSession().delete(entity);
		this.getSession().getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	protected List<T> executeQuery(String query) {
		try {
			Query queryHql = this.getSession().createQuery(query);

			return queryHql.list();
		} catch (RuntimeException e) {
			this.logger.error(e.getMessage(), e);

			throw e;
		}
	}

	// ///////////////////////////////////////////////////////////////////////////////
	// GET AND SET METHODS
	// ///////////////////////////////////////////////////////////////////////////////

	public Session getSession() {
		if (this.session == null) {
			this.logger.error("Session not founded.");

			throw new IllegalStateException("Session has not been set on DAO before usage");
		}

		return this.session;
	}

	/////////////////////////////////////////////////////////////////////////////////
	// PRIVATE METHODS
	/////////////////////////////////////////////////////////////////////////////////

	private Class<T> getPersistentClass() {
		return this.persistentClass;
	}

	@SuppressWarnings("unchecked")
	private List<T> findByCriteria(Criterion... criterion) {
		Criteria crit = this.getSession().createCriteria(this.getPersistentClass());

		for (Criterion c : criterion) {
			crit.add(c);
		}

		return crit.list();
	}

	private Session getCurrentSession() {
		return HibernateUtility.getSession();
	}

}
