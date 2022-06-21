package com.cg.hibmapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
//    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
		
		
		Laptop laptop =new Laptop();
    	laptop.setLid(2000);
    	laptop.setLname("hp");
    	
    	
    	Student s=new Student();
    	s.setRollNo(101);
    	s.setStdName("kumar");
    	s.setStdMarks(90);
    	s.getLaptop().add(laptop);
    	
    	laptop.getStudent().add(s);
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	session.save(s);
    	session.save(laptop);
    	
    	session.getTransaction().commit();
    }
}
