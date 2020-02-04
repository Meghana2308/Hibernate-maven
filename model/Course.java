package com.cts.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {
	@Id
	private int cid;
	private String cname;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="course")
	private Set<Trainee> trainees;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(Set<Trainee> trainees) {
		this.trainees = trainees;
	}

	public Course(int cid, String cname, Set<Trainee> trainees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.trainees = trainees;
	}

	public Course() {
		super();
	}
	

}
