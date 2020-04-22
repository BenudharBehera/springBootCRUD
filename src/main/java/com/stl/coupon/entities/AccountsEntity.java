package com.stl.coupon.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_account")
public class AccountsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long id;
	
	@Column(name = "bank_name")
	private String bankName;
	
	@Column(name = "account_id",unique = true,nullable = false)
	private long accountId;
	
	@Column(name = "account_type")
	private String accountType;
	
	/*@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "account_id", nullable = false,insertable = false,updatable = false)
	private EmployeAccountEntity accountEntity;*/
	
}
