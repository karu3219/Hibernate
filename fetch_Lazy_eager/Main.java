package fetch_Lazy_eager;

import java.net.MulticastSocket;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main 
{
	public static void main(String args[])
	{
//		SetValuesOfStudentAndLaptop.setUpVal();
		
		Student st = null;
		Configuration cn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
			
		SessionFactory sf = cn.buildSessionFactory(reg);
		
		Session session =  sf.openSession();
		
		Transaction  t = session.beginTransaction();
		st=(Student)session.get(Student.class,4055);
		System.out.println(st.getName());
		Collection<Laptop> lp=st.getLap();
		for(Laptop l : lp)
		{
			System.out.println(l.getL_name());
		}
		t.commit();
		
		

	}
}
