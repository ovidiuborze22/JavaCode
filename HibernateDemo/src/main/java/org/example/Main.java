package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("HP");
        l1.setModel("Omen");
        l1.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("John");
        a1.setTech("Java");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(l1);
        session.persist(a1);
        transaction.commit();

        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);
        session.close();
        sf.close();

    }
}
