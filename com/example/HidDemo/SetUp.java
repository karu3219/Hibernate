package com.example.HidDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SetUp 
{
    	
    	Configuration cn = new Configuration().configure().addAnnotatedClass(User.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cn.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction t = session.beginTransaction();
}
