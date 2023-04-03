package com.example.HidDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SelectOperation 
{
	public static void SelectOp(int id)
	{
		SetUp s = new SetUp();
		Session session = s.session;
		User ur=null;
    	Transaction tx = s.t;
    	
    	ur =(User) session.get(User.class,id);
        System.out.println(ur);
    	tx.commit();
    	
    	
	}

}
