package com.garib.service;

import java.util.List;

import com.garib.bean.Account;
import com.garib.bean.Customer;
import com.garib.bean.Transaction;
import com.garib.dao.AccountDao;
import com.garib.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	AccountDao ad=new AccountDaoImpl();
	@Override
	public String createAccount(Customer cust) {
		
		return ad.createAccount(cust);
	}

	@Override
	public double showBalance(String accNo) {
		// TODO Auto-generated method stub
		return ad.showBalance(accNo);
	}

	@Override
	public String withdraw(String accNo, Double amount) {
		// TODO Auto-generated method stub
		return ad.withdraw(accNo, amount);
	}

	@Override
	public String deposit(String accNo, Double amount) {
		// TODO Auto-generated method stub
		return ad.deposit(accNo, amount);
		
	}

	@Override
	public String fundTransfer(String accNo1, String accNo2, Double amount) {
		// TODO Auto-generated method stub
		return ad.fundTransfer(accNo1, accNo2, amount);
	}

	@Override
	public List<Transaction> printTransaction(String accNo) {
		// TODO Auto-generated method stub
		return ad.printTransaction(accNo);
	}

	@Override
	public Account printDetails(String accNo) {
		// TODO Auto-generated method stub
		return ad.printDetails(accNo);
	}

}