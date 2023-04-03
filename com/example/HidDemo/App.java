package com.example.HidDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {

//    	in.insertOp(123,"kartik","koppal");
//    	InsertOperation.insertOp(4058,"rachamogudu","sai", "dinesh", "banglore");
    	
    	SelectOperation.SelectOp(4058);
    }
}
