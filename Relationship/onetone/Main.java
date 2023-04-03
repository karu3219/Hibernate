package Relationship.onetone;

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
		lap.setLid(123);
		lap.setLname("HP");
		
		Student st = new Student();
		st.setId(4055);
		st.setSname("kartik");
		st.setLap(lap);
		
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
