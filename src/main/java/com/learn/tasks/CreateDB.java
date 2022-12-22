package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    static Connection con;

    public static void createDB(String config) throws IOException, SQLException {


        con= DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
        String s="CREATE TABLE Persons (PersonID int ,LastName varchar(255),FirstName varchar(255),Address varchar(255),City varchar(255))";


        Statement st=con.createStatement();
        st.executeUpdate(s);

        System.out.println("Table created");



    }




}
