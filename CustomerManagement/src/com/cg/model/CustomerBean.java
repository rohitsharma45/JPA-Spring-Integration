package com.cg.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer_table")

public class CustomerBean {
	
	@Id
	@Column(name="cust_id")
	private String custId;
	@Column(name="cust_name")
	private String custName;
	@Column(name="cust_phone")
	private String custPhone;
	@Column(name="cust_email")
	private String custEmail;
	@Column(name="cust_dob")
	private Date custDob;
	
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName
				+ ", custPhone=" + custPhone + ", custEmail=" + custEmail
				+ ", custDob=" + custDob + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	
}
