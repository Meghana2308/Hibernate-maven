package com.cts.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import com.cts.demos.StudentIdentity;
import com.cts.model.Student;
import com.cts.util.JPAUtil;

public class Employee1ForCompositePK {
	public static void main(String[] args) {
		Student s= new Student(new StudentIdentity(1,'A',7),"pushpa","rekha",new Date(2000,5,5));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
		System.out.println("Student saved");
		JPAUtil.shutdown();
	}

}
