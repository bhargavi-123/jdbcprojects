package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
	    
     Employee employee= null;
     employee= em.find(Employee.class, 3);
     System.out.println(employee);
     
     System.out.println(employee instanceof Employee);
     
     System.out.println(employee instanceof Manager);
     System.out.println(employee instanceof ContractEmployee);
     if(employee instanceof Employee) {
    	 Employee e = employee;
    	 System.out.println(e.getEmployeeId());
    	 System.out.println(e.getName());
    	 System.out.println(e.getSalary());
     }
     if(employee instanceof Manager) {
    	 Manager m = (Manager) employee;
    	 System.out.println(m.getDepartmentName());
    	 System.out.println(m.getEmployeeId());
    	 System.out.println(m.getName());
    	 System.out.println(m.getSalary());
     }
     if(employee instanceof ContractEmployee) {
    	 ContractEmployee ce = (ContractEmployee) employee;
    	 System.out.println(ce.getEmployeeId());
    	 System.out.println(ce.getDuration());
    	 System.out.println(ce.getName());
    	 System.out.println(ce.getSalary());
     }
     em.close();
     emf.close();
     
	}

}
