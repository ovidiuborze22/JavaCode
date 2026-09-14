package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();


//        s1.setRollNo(103);
//        s1.setsName("Harsh");
//        s1.setsAge(24);

        s1.setRollNo(107);
        s1.setsName("Arthur");
        s1.setsAge(29);

//        Student s2 = null;

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Student.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        s1 = session.find(Student.class, 107);
        Transaction transaction = session.beginTransaction();
//        session.merge(s1); // update
        session.remove(s1); // remove
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }
}
