package com.garib.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	/*@SequenceGenerator(name="seq",sequenceName="hibernate_sequence")        
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")*/
	
	private String cif;
	private String accName;
	private String dob;
	private String address;
	private String phoneNo;
	private String email;
	private String aadhar;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="accNo")
	private Account account;
	public Customer() {}
	public Customer(String accName, String dob, String address, String phoneNo, String email, String aadhar, Account account) {
		super();
		this.accName = accName;
		this.dob = dob;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.aadhar = aadhar;
		this.account=account;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	

}
