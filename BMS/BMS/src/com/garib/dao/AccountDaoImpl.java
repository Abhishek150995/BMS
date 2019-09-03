package com.garib.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.garib.bean.Account;
import com.garib.bean.Customer;
import com.garib.bean.Transaction;

public class AccountDaoImpl implements AccountDao{
	public int getSequence() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Query q=ses.createNativeQuery("select nextval('myseq')");
		List li=q.getResultList();
		int i=(int)li.get(0);
		return i;
	}
	
	@Override
	public String createAccount(Customer cust) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		ses.save(cust);
		tx.commit();
		ses.close();
		return "Account Created";
	}

	@Override
	public double showBalance(String accNo) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		
		Account acc=(Account)ses.get(Account.class, accNo);
		Double bal=acc.getCurBal();
		ses.close();
		return bal;
		
	}

	@Override
	public String withdraw(String accNo, Double amount) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		Account acc=(Account)ses.get(Account.class, accNo);
		double bal=acc.getCurBal();
		acc.setCurBal(bal-amount);
		Transaction t=new Transaction("withdraw", accNo , "Self", amount, new Date());
		t.setAccount(acc);
		ses.saveOrUpdate(t);
		ses.saveOrUpdate(acc);
		
		tx.commit();
		
		ses.close();
		return "Updated";
	}

	@Override
	public String deposit(String accNo, Double amount) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		Account acc=(Account)ses.get(Account.class, accNo);
		double bal=acc.getCurBal();
		acc.setCurBal(bal+amount);
		Transaction t=new Transaction("Deposit", accNo , "Self", amount, new Date());
		t.setAccount(acc);
		ses.saveOrUpdate(t);
		ses.saveOrUpdate(acc);
		
		tx.commit();
		
		ses.close();
		return "Updated";
	}

	@Override
	public String fundTransfer(String accNo1, String accNo2, Double amount) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		Account acc1=(Account)ses.get(Account.class, accNo1);
		double bal1=acc1.getCurBal();
		acc1.setCurBal(bal1-amount);
		Account acc2=(Account)ses.get(Account.class, accNo2);
		double bal2=acc2.getCurBal();
		acc2.setCurBal(bal2+amount);
		Transaction t=new Transaction("FundTransfer", accNo1 , accNo2, amount, new Date());
		t.setAccount(acc1);
		ses.saveOrUpdate(t);
		ses.saveOrUpdate(acc1);
		ses.saveOrUpdate(acc2);
		tx.commit();
		ses.close();
		return "Transaction Successful";
	}

	@Override
	public List<Transaction> printTransaction(String accNo) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Query q=ses.createQuery("from Transaction where payeeacc=:accNo or recpacc=:accNo");
		q.setParameter("accNo", accNo);
		List<Transaction> li=q.getResultList();
		return li;
	}

	@Override
	public Account printDetails(String accNo) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		Account acc=(Account)ses.get(Account.class, accNo);
		return acc;
	}

}
