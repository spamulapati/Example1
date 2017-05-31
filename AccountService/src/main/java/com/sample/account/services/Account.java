package com.sample.account.services;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;


@Entity
@Table(appliesTo="Account")
public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;

	protected String number;

	@Column(name = "name")
	protected String owner;

	protected BigDecimal balance;
	
	public Account(){
		
	}
	
	/**
	 * Default constructor for JPA only.
	 */
	protected Account(long id) {
		this.id=id;
		balance = BigDecimal.ZERO;
	}

	public Account(String number, String owner) {
		this.number = number;
		this.owner = owner;
		balance = BigDecimal.ZERO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
