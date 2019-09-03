package com.garib.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class Transaction {
		
		@Id
		@SequenceGenerator(name="seq",sequenceName="myseq")        
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
		private long tID;
		private String tType;
		private String payeeAcc;
		private String recpAcc;
		private Double amount;
		private Date tDate;
		@ManyToOne
		@JoinColumn(name="accNo")
	    private Account account;
		public Transaction() {}
		public Transaction(String tType, String payeeAcc, String recpAcc, Double amount,Date tDate ) {
			super();
			this.tType = tType;
			this.payeeAcc = payeeAcc;
			this.recpAcc = recpAcc;
			this.amount = amount;
			this.tDate=tDate;
		}
		public long gettID() {
			return tID;
		}
		public void settID(long tID) {
			this.tID = tID;
		}
		public String gettType() {
			return tType;
		}
		public void settType(String tType) {
			this.tType = tType;
		}
		public String getPayeeAcc() {
			return payeeAcc;
		}
		public void setPayeeAcc(String payeeAcc) {
			this.payeeAcc = payeeAcc;
		}
		public String getRecpAcc() {
			return recpAcc;
		}
		public void setRecpAcc(String recpAcc) {
			this.recpAcc = recpAcc;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public Date gettDate() {
			return tDate;
		}
		public void settDate(Date tDate) {
			this.tDate = tDate;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account=account;
		}
		
		
}
