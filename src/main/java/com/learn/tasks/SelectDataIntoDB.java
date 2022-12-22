package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDataIntoDB {

    static Connection con;

    public static void selectData(String config) throws IOException, SQLException {

         con=DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
         String s="SELECT * FROM persons";

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(s);

        while (rs.next()){

            System.out.println(rs.getInt(1)+"," +rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));

        }




    }



}
