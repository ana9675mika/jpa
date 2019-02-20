package com.cg.ems.util;

import javax.persistence.*;

public class JPAUtil 
{
	private static EntityManagerFactory emf=null;
	private static EntityManager em=null;
	public static EntityManager getEntityManager()
	{
		emf=Persistence.createEntityManagerFactory("Oracle-JPA-PU");
		em=emf.createEntityManager();
		return em;
	}
}
