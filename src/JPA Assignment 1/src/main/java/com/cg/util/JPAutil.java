package com.cg.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	private static EntityManagerFactory factory;
	static {
		factory=Persistence.createEntityManagerFactory("oracle-pu");
	       }
	public  static EntityManagerFactory getEntityManagerFactory() {
		return factory;
	     }

	public static void shutdown() {
		factory.close();
		
	}
}
