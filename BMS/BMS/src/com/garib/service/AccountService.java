package com.garib.service;

import java.util.List;

import com.garib.bean.Account;
import com.garib.bean.Customer;
import com.garib.bean.Transaction;

public interface AccountService {
	public String createAccount(Customer cust);
	public double showBalance(String accNo);
	public String withdraw(String accNo,Double amount);
	public String deposit(String accNo, Double amount);
	public String fundTransfer(String accNo1,String accNo2,Double amount);
	public List<Transaction> printTransaction(String accNo);
	public Account printDetails(String accNo);
}
