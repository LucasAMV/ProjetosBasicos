package br.com.emtest.persistence.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.emtest.persistence.entities.Address;

/**
 * Home object for domain model class Address.
 * @see .Address
 * @author Hibernate Tools
 */
@Stateless
public class AddressHome {

	private static final Log log = LogFactory.getLog(AddressHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Address transientInstance) {
		log.debug("persisting Address instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Address persistentInstance) {
		log.debug("removing Address instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Address merge(Address detachedInstance) {
		log.debug("merging Address instance");
		try {
			Address result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Address findById(Short id) {
		log.debug("getting Address instance with id: " + id);
		try {
			Address instance = entityManager.find(Address.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
