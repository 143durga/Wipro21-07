package com.wipro.hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.hibernate.entity.Pan;
import com.wipro.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session= HibernateUtil.getSessionFactory().openSession();
    	Transaction tx=session.beginTransaction();
    	Pan pan= new Pan("Durga Bhavani", "DLTPB1234X");   
    	 session.persist(pan);

         tx.commit();
         session.close();

         System.out.println("✅ PAN record inserted successfully!");

         HibernateUtil.shutdown();
    }
}
