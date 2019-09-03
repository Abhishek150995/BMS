package com.garib.service;

import java.util.List;

import com.garib.bean.Account;
import com.garib.bean.Customer;
import com.garib.bean.Transaction;

public class AccountServiceImpl implements AccountService{
	
	@Override
	public String createAccount(Customer cust) {
		
		return null;
	}

	@Override
	public double showBalance(String accNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String withdraw(String accNo, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposit(String accNo, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fundTransfer(String accNo1, String accNo2, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> printTransaction(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account printDetails(String accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}