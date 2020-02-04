package com.cts.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("cemp")
//@Table(name="cemps")

@Table(name="cemps_Only")
public class ContractEmp extends Emp{
	@Column(name="duration")
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ContractEmp(long eid, String ename, double basic, int duration) {
		super(eid, ename, basic);
		this.duration = duration;
	}

	public ContractEmp() {
		
	}

	@Override
	public String toString() {
		return "ContractEmp [duration=" + duration + ", getDuration()=" + getDuration() + ", getEid()=" + getEid()
				+ ", getEname()=" + getEname() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	

}
