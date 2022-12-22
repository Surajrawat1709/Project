package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataFromDB {
    static Connection con;

    public static void updateData(String config) throws IOException, SQLException {

        con = DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter new data to be updated");

        System.out.println("Enter the ID you want to update");
        int id = sc.nextInt();
        System.out.println("Enter the new Name");
        String name = sc.next();
        System.out.println("Enter the new Surname");
        String sname = sc.next();
        System.out.println("Enter the new Address");
        String add = sc.next();
        System.out.println("Enter the new City");
        String city = sc.next();


        String s = "Update persons SET LastName=?,FirstName=?,Address=?,city=? WHERE PersonID=?";

        PreparedStatement pr = con.prepareStatement(s);

        pr.setInt(5, id);
        pr.setString(1, sname);
        pr.setString(2, name);
        pr.setString(3, add);
        pr.setString(4, city);

        pr.executeUpdate();

        System.out.println("Data updated");

    }
}
