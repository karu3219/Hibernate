package com.example.HidDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class InsertOperation 
{
	public static void insertOp(int id,String fname,String mname,String lname, String address)
	{
		
		Name namedet = new Name();
		
		namedet.setFname(fname);
		namedet.setMname(mname);
		namedet.setLname(lname);
		
		User ur = new User();
		ur.setUserId(id);
		ur.setName(namedet);
		ur.setAddress(address);
		
		SetUp s = new SetUp();
		Session session = s.session;
    	
		Transaction tx = s.t;
		
		session.save(ur);
    	tx.commit();
	}
}
