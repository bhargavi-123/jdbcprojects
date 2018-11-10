package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			Query query =em.createNamedQuery("maleFilterQuery");
			 List<Person> person= query.getResultList();
			 for(Person p :person) {
				 System.out.print(p.getName()+"\t");
				 System.out.print(p.getGender()+"\t");
				 System.out.print(p.getAge()+"\t");
				 System.out.println(p.getSalary()+"\t");
				 
	}
	}
}
