package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
     EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	 EntityManager em = factory.createEntityManager();
	 
	 
     em.getTransaction().begin();
		
	
	Person p1 = new Person("sai", 20, 5000.00, 'F');
	Person p2 = new Person("siri", 22, 7000.00, 'F');
	Person p3 = new Person("siva", 23, 8000.00, 'M');
	Person p4 = new Person("Mahi", 26, 10000.00, 'M');
	Person p5 = new Person("Madhav", 27, 13000.00, 'M');
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	em.persist(p4);
	em.persist(p5);
	em.getTransaction().commit();
	em.close();
	factory.close();
	
	}
}
