package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.ContractEmp;
import com.cts.model.Emp;
import com.cts.model.Manager;
import com.cts.util.JPAUtil;

public class Employee2 {

	public static void main(String[] args) {
		Emp e=new Emp(101,"pushpa",25000);
		Manager m=new Manager(102,"ram",35000,9400);
		ContractEmp ce=new ContractEmp(103,"kittu",45200,11);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("All records Saved");
		
		JPAUtil.shutdown();
		

	}

}
