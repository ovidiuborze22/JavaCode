package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("John");
        a1.setTech("Java");

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Alien.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        transaction.commit();
        session.close();
        sf.close();

    }
}
