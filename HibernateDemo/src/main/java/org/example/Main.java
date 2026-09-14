package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();


        s1.setRollNo(106);
        s1.setsName("Robert");
        s1.setsAge(23);

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(org.example.Student.class)
                .buildSessionFactory();

        Session session = sf.openSession();
        s2 = session.find(Student.class, 102);

        session.close();
        sf.close();
        System.out.println(s2);

    }
}
