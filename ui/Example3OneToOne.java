package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.BankAccount;
import com.cts.model.Customer;
import com.cts.util.JPAUtil;

public class Example3OneToOne {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("2345235","pushpa",ba);
		ba.setAccono("Sbi");
		ba.setCustomer(cs);   //bi directional
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cs);
		//bank account auotomatically persisted
		em.getTransaction().commit();
		
		System.out.println("All records Saved");
		
		JPAUtil.shutdown();
		

	}

}
