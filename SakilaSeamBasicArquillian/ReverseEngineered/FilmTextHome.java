// default package
// Generated 21/01/2020 23:08:10 by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FilmText.
 * @see .FilmText
 * @author Hibernate Tools
 */
@Stateless
public class FilmTextHome {

	private static final Log log = LogFactory.getLog(FilmTextHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FilmText transientInstance) {
		log.debug("persisting FilmText instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FilmText persistentInstance) {
		log.debug("removing FilmText instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FilmText merge(FilmText detachedInstance) {
		log.debug("merging FilmText instance");
		try {
			FilmText result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FilmText findById(Short id) {
		log.debug("getting FilmText instance with id: " + id);
		try {
			FilmText instance = entityManager.find(FilmText.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
