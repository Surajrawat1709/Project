package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataFromDB {

    static Connection con;

    public static void deleteDB(String config) throws IOException, SQLException {

        con = DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
        String s = "DROP table persons";


        Statement st = con.createStatement();
        st.execute(s);

        System.out.println("Table deleted");


    }
}