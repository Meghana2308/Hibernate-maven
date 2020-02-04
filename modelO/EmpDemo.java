package com.cts.modelO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Emp1 e=new Emp1();
		e.setEname("pushpa");
		e.setEname("rekha");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Inserted............");
	}

}
