package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("mang")
//@Table(name="mgrs")
@Table(name="mgrs_Only")
public class Manager extends Emp {
	@Column(name="allowence")
	private double allowence;

	public Manager(long eid, String ename, double basic, double allowence) {
		super(eid, ename, basic);
		this.allowence = allowence;
	}

	public Manager() {
		
	}

	public double getAllowence() {
		return allowence;
	}

	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}

	@Override
	public String toString() {
		return "Manager [allowence=" + allowence + ", getAllowence()=" + getAllowence() + ", getEid()=" + getEid()
				+ ", getEname()=" + getEname() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
