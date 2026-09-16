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

//   Select * from laptop where ram=32 ->SQL
//        from Laptop where ram=32 -> HQL

        String brand = "Asus";

//        Query query = session.createQuery("from Laptop where brand like 'Asus' ");

        Query query = session.createQuery("select brand, model from Laptop where brand like ?1",Laptop.class);
        query.setParameter(1, brand);

//        List<Laptop> laptops = query.getResultList();
        List<Object[]> laptops = query.getResultList();

        for (Object[] data : laptops) {
            System.out.println((String) data[0] + " : " + (String) data[1]);
        }
//        Laptop l1=session.get(Laptop.class, 3);


        System.out.println(laptops);
        session.close();

        sf.close();

    }
}
