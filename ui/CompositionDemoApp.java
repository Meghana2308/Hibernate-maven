package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.Address;
import com.cts.model.Faculty;
import com.cts.util.JPAUtil;

public class CompositionDemoApp {

	public static void main(String[] args) {
		Faculty f=new Faculty("pushpa",new Address("A101","m.r palli","chittoor"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		//commit all txns but not working here
		//em.flush();
		
		
		System.out.println("Faculty saved");
		
		JPAUtil.shutdown();

	}

}
