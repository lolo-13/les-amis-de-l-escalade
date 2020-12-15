package org.compain.lade.lade.dao;

import org.compain.lade.lade.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDao {
	
	SessionFactory factory = HibernateUtils.getSessionFactory();
	
	protected Session session() {
		return factory.getCurrentSession();
	}
}
