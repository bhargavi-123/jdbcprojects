package com.training.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//String JPQL = "from Person";
   String JPQL = "select p  from Person p where p.gender='M' and p.salary between :startrange and :endrange";
    
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	
	 Query query = em.createQuery(JPQL);
	 query.setParameter("startrange", 5000.00);
	 query.setParameter("endrange", 15000.00);
	 
	 List<Person> person= query.getResultList();
	 for(Person p :person) {
		 System.out.print(p.getName()+"\t");
		 System.out.print(p.getGender()+"\t");
		 System.out.print(p.getAge()+"\t");
		 System.out.println(p.getSalary()+"\t");
		 
	 }
	 
	
    
	}

}
