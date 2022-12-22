package com.learn.tasks;

import com.learn.utils.DBConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MetaDataInformation {
    static Connection con;

    public static void getMetaData(String config) throws IOException, SQLException{

        con= DBConnection.getConnection(config);
        if (con != null) {
            System.out.println("Connection established");



        } else {
            throw new SQLException("Connection not established! check username or password ");
        }
        DatabaseMetaData dbmd = (DatabaseMetaData) con.getMetaData();
        System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
        System.out.println("Driver Name: " + dbmd.getDriverName());
        System.out.println("UserName: " + dbmd.getUserName());
        System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
        System.out.println("Database Type: " + dbmd.getTableTypes());






    }
}
