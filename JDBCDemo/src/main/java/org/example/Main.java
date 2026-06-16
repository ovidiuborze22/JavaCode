package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
            JDBC Steps:

            1. Import packages
            2. Load and register driver
            3. Create connection
            4. Create statement
            5. Execute statement
            6. Process results
            7. Close connection
        */

        // 1. Connecting Java and DB
//        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
//        String uname = "userName";
//        String pass = "userPassword";
//
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//
//        con.close();
//        System.out.println("Connection closed");


        // 2. Execute and Process
//        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
//        String uname = "userName";
//        String pass = "userPassword";
//
//        String sql = "select sname from student where sid=1";
//
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//
//        rs.next();
//        String name = rs.getString("sname");
//        System.out.println("Name of a student is " + name);
//
//        con.close();
//        System.out.println("Connection closed");


        // 3. Fetching all records
//        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
//        String uname = "userName";
//        String pass = "userPassword";
//
//        String sql = "select * from student";
//
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//
//        while (rs.next()) {
//            System.out.print(rs.getInt(1) + " - ");
//            System.out.print(rs.getString(2) + " - ");
//            System.out.println(rs.getInt(3));
//        }
//
//        con.close();
//        System.out.println("Connection closed");


        // 4. CRUD operations
//        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
//        String uname = "userName";
//        String pass = "userPassword";
//
//        // String sql = "insert into student values (5, 'Albert', 75)";
//        // String sql = "update student set sname = 'Max' where sid = 5";
//        String sql = "delete from student where sid = 5";
//
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//
//        Statement st = con.createStatement();
//        st.execute(sql);
//
//        con.close();
//        System.out.println("Connection closed");


        // 5. Problems with Statement
//        int sid = 101;
//        String sname = "Max";
//        int marks = 48;
//
//        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
//        String uname = "userName";
//        String pass = "userPassword";
//
//        String sql = "insert into student values (" + sid + ", '" + sname + "', " + marks + ")";
//
//        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//
//        Statement st = con.createStatement();
//        st.execute(sql);
//
//        con.close();
//        System.out.println("Connection closed");


        // 6. Prepared Statement
        int sid = 102;
        String sname = "Jasmine";
        int marks = 52;

        String url = "jdbc:postgresql://hostName:portNumber/databaseName";
        String uname = "userName";
        String pass = "userPassword";

        String sql = "insert into student values (?, ?, ?)";

        // Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        con.close();
        System.out.println("Connection closed");
    }
}