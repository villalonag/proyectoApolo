package com.apolo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Trax {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int idtrx;
	
	@Column(name = "amount" )
	private double amount;

	public int getIdtrx() {
		return idtrx;
	}

	public void setIdtrx(int idtrx) {
		this.idtrx = idtrx;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
		

}
