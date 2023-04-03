package hibernate_caching.caching_level_1;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main
{
	public static void main(String args[])
	{
		Customer_Details cus = new Customer_Details();
		
		cus.setCustomer_id(1023);
		cus.setCustomer_name("kartik");
		cus.setPurchased_item("boll");
		Configuration cn = new Configuration().configure().addAnnotatedClass(Customer_Details.class);
		ServiceRegistry service_registry = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
		SessionFactory sf = cn.buildSessionFactory(service_registry);
		
		Session session1 = sf.openSession();
		
		session1.beginTransaction();
		
		session1.save(cus);
		session1.getTransaction().commit();
		session1.close();
		
	}
}
