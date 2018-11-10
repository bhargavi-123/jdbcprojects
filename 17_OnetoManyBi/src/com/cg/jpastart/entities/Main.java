package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, 1001);
		System.out.println(e.getName()+","+e.getSalary()+","+e.getDepartment().getName());
		em.close();
		factory.close();
		
	}

}
