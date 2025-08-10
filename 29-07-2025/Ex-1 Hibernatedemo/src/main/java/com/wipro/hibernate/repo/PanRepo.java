package com.wipro.hibernate.repo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibernate.entity.Pan1;
import com.wipro.hibernate.util.HibernateUtil1;

public class PanRepo {
	
	public static void createPan() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter PAN Holder Name:");
	    String name = sc.nextLine();
	    System.out.println("Enter PAN Number:");
	    String number = sc.nextLine();

	    Pan1 pan = new Pan1(name, number);
	    save(pan);
	}
	public static void updatePan() {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter PAN id to update: ");
	    int id = sc.nextInt();
	    sc.nextLine(); 

	    System.out.print("Enter new PAN Holder Name: ");
	    String name = sc.nextLine();

	    System.out.print("Enter new PAN Number: ");
	    String panNumber = sc.nextLine();

	    Pan1 pan = new Pan1(id, name, panNumber);
	    save(pan);
	}
	public static void save(Pan1 pan) {
	    Session session = HibernateUtil1.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();

	    if (pan.getId() != 0) {
	        Pan1 existing = session.find(Pan1.class, pan.getId());
	        existing.setPanholderName(pan.getPanholderName());
	        existing.setPanNumber(pan.getPanNumber());
	        session.merge(existing);
	    } else {
	        session.persist(pan);
	    }

	    tx.commit();
	    session.close();
	}

    // Find PAN by ID
    public static Pan1 findById(int id) {
        Session session = HibernateUtil1.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Pan1 pan = session.find(Pan1.class, id);
        tx.commit();
        return pan;
    }

    // Delete PAN by ID
    public static Pan1 deleteById(int id) {
        Session session = HibernateUtil1.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Pan1 pan = session.find(Pan1.class, id);
        if (pan != null) {
            session.remove(pan);
            System.out.println("✅ Deleted successfully.");
        } else {
            System.out.println("❌ PAN not found.");
        }
        transaction.commit();
        return pan;
    }

    // Find all PANs
    public static List<Pan1> findAll() {
        Session session = HibernateUtil1.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        List<Pan1> list = session.createQuery("from Pan1", Pan1.class).list(); // Correct HQL
        tx.commit();
        return list;
    }


    // Find all PAN Numbers
    public static List<String> findAllPanNumbers() {
        Session session = HibernateUtil1.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query<String> query = session.createQuery("SELECT panNumber FROM Pan1", String.class);
        List<String> list = query.list();
        tx.commit();
        return list;
    }

    // Find PANs by Holder Name
    public static List<Pan1> findByPanholderName(String name) {
        Session session = HibernateUtil1.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query<Pan1> query = session.createQuery("FROM Pan1 WHERE panholderName = :name", Pan1.class);
        query.setParameter("name", name);
        List<Pan1> list = query.list();
        tx.commit();
        return list;
    }
}
