package com.garib.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.garib.bean.Account;
import com.garib.bean.Customer;
import com.garib.bean.Transaction;
import com.garib.dao.AccountDaoImpl;



public class AccountMain {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		org.hibernate.Transaction tx=ses.beginTransaction();
		/*Account acc= new Account("Savings", 150450.0, "SBIN0002","hello");
		Transaction t1=new Transaction("widhdraw", "123456789", "987654321", 12000.0, new Date());
		
		Transaction t2=new Transaction("deposit", "987654321", "123456789", 12000.0, new Date());
		t1.setAccount(acc);
		t2.setAccount(acc);
		
		List<Transaction> li= new ArrayList<Transaction>();
		li.add(t1);
		li.add(t2);
		
		acc.setTransactions(li);
		acc.setAccNo("YM114");
		Customer c= new Customer("Gitesh", "18-09-1997", "Delhi", "8797879746", "abc@gmail.com", "aadhar", acc);
		c.setCif("GL114");
		ses.save(acc);
		ses.save(c);
		tx.commit();*/
		AccountDaoImpl a=new AccountDaoImpl();
		/*
		Account acc= new Account("Savings", 19000.0, "SBIN0002","hello");
		acc.setAccNo("YM113");
		Customer c= new Customer("Gitesh", "18-09-1997", "Delhi", "8797879746", "abc@gmail.com", "aadhar", acc);
		c.setCif("GL114");
		System.out.println(a.createAccount(c));*/
		/*
		System.out.println(a.withdraw("YM113", 1542.50));
		System.out.println(a.showBalance("YM113"));
		System.out.println(a.showBalance("YM113"));
		System.out.println(a.showBalance("YM114"));
		a.fundTransfer("YM113", "YM114", 10000.0);
		System.out.println(a.showBalance("YM113"));
		System.out.println(a.showBalance("YM114"));*/
		List<Transaction>li= a.printTransaction("YM114");
		for(Transaction l:li)
		{
			System.out.println(l.gettID()+"\t"+l.gettType());
		}
		ses.close();
		
	
	}

}
