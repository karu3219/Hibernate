package fetch_Lazy_eager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SetValuesOfStudentAndLaptop {
	public static void setUpVal() {
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	Student st4 = new Student();
	
	st1.setS_id(4055);
	st1.setName("kartik");
	
	st2.setS_id(4058);
	st2.setName("Dhinesh");
	
	st3.setS_id(4034);
	st3.setName("Sujith");
	
	st4.setS_id(4038);
	st4.setName("Afthab");
	
	
	Laptop lap1 = new Laptop();
	Laptop lap2 = new Laptop();
	Laptop lap3 = new Laptop();
	Laptop lap4 = new Laptop();
	Laptop lap5 = new Laptop();
	
	lap1.setL_id(101);
	lap1.setL_name("Dell");
	lap1.setSt(st2);
	
	lap2.setL_id(102);
	lap2.setL_name("HP");
	lap2.setSt(st4);
	
	lap3.setL_id(103);
	lap3.setL_name("Mac");
	lap3.setSt(st1);
	
	lap4.setL_id(104);
	lap4.setL_name("asses");
	lap4.setSt(st1);
	
	lap5.setL_id(105);
	lap5.setL_name("lenova");
	lap5.setSt(st2);
	
	Configuration cn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
	SessionFactory sf = cn.buildSessionFactory(reg);
	
	Session session = sf.openSession();
	
	Transaction t = session.beginTransaction();
	session.save(st1);
	session.save(st2);
	session.save(st3);
	session.save(st4);
	
	session.save(lap1);
	session.save(lap2);
	session.save(lap3);
	session.save(lap4);
	session.save(lap5);
	
	t.commit();
	session.close();
	}
}
