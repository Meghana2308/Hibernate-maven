package com.cts.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.model.Course;
import com.cts.model.Trainee;
import com.cts.util.JPAUtil;

public class Example4OneToMany {
	public static void main(String[] args) {
		Course mca=new Course(101,"btech",new TreeSet<Trainee>());
		Course mba=new Course(102,"mba",new TreeSet<Trainee>())	;	
		mca.getTrainees().add(new Trainee(201,"pushpa",mca));
		mca.getTrainees().add(new Trainee(202,"rekha",mca));
		mca.getTrainees().add(new Trainee(203,"nandhu",mca));
		
		mba.getTrainees().add(new Trainee(204,"dad",mba));
		mba.getTrainees().add(new Trainee(205,"mom",mba));
		mba.getTrainees().add(new Trainee(206,"bro",mba));
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		
		txn.commit();
		
		
	}

}
