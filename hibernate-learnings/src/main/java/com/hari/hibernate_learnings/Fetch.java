package com.hari.hibernate_learnings;


import org.hibernate.cfg.Configuration;

import jakarta.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.Session;


public class Fetch 
{
    public static void main( String[] args )
    {
        Admin hari = new Admin();
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Admin.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        hari = (Admin) session.get(Admin.class, 10);
        
        tx.commit();
        
        System.out.println(hari);
    }
}

