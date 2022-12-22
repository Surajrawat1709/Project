package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataIntoDB {
    static Connection con;

    public static void insertData(String config) throws IOException, SQLException {

        con = DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
        Scanner sc = new Scanner(System.in);


        String ch;

do {

    System.out.println("Enter your ID");
    int id = sc.nextInt();
    System.out.println("Enter your Name");
    String name = sc.next();
    System.out.println("Enter your Surname");
    String sname = sc.next();
    System.out.println("Enter your Address");
    String add = sc.next();
   System.out.println("Enter your City");
    String city = sc.next();


    String s = "INSERT INTO persons(PersonID,LastName,FirstName,Address,city) VALUES(?,?,?,?,?)";

    PreparedStatement pr = con.prepareStatement(s);


    pr.setInt(1, id);
    pr.setString(2, sname);
    pr.setString(3, name);
    pr.setString(4, add);
    pr.setString(5, city);

    pr.executeUpdate();

    System.out.println("Data inserted");
    System.out.println("Do you want to insert data: y/n");
    ch=sc.next();

}while(ch.equalsIgnoreCase("y"));
    }
}
