package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();

//        Laptop laptop = session.find(Laptop.class, 2);
//        Laptop laptop = session.getReference(Laptop.class, 2);

        Laptop laptop = session.getReference(Laptop.class,2);
        System.out.println(laptop);
        session.close();

        sf.close();

    }
}
