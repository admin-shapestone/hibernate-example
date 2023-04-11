package com.shapestone.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilWithCfg {
	private static SessionFactory sessionFactory = getSessionFactory();

	public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure("com\\shapestone\\hibernate\\util\\hibernate.cfg.xml");
                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}