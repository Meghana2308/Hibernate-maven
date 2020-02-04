package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Bankaccounts")
public class BankAccount {
	@Id
	private String accono;
	
	@OneToOne
	@JoinColumn(name="aadhar")
	private Customer customer;

	public BankAccount(String accono, Customer customer) {
		super();
		this.accono = accono;
		this.customer = customer;
	}

	public BankAccount() {
		super();
	}

	public String getAccono() {
		return accono;
	}

	public void setAccono(String accono) {
		this.accono = accono;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
