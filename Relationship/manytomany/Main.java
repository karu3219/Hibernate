package Relationship.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.example.HidDemo.User;

public class Main 
{
	public static void main(String args[])
	{
		Laptop lap = new Laptop();
		lap.setLid(124);
		lap.setLname("HP");
		
		Student st = new Student();
		st.setId(4058);
		st.setSname("kartik");
		List<Laptop> ls = new ArrayList<>();
		ls.add(lap);
		st.setLap(ls);
		
		lap.getSt().add(st);
		
		Configuration cn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cn.buildSessionFactory(reg);
    	
    	Session session = sf.openSession();
    	
    	Transaction t = session.beginTransaction();
		session.save(lap);
    	session.save(st);
		
		t.commit();
	}
}
