package com.hari.hibernate_learnings;

import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.Session;


public class App 
{
    public static void main( String[] args )
    {
        Admin hari = new Admin();
        hari.setId(10);
        hari.setName("mass");
        hari.setRole("head");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Admin.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(hari);
        
        tx.commit();
    }
}
