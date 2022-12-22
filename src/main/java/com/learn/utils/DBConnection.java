package com.learn.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection(String config) throws IOException, SQLException {
        ReadConfig readConfig = new ReadConfig(config);
        Properties properties = readConfig.getProperties();

        String dbType = properties.getProperty("db.type");
        String username = properties.getProperty("username_db");
        String password = properties.getProperty("password_db");
        String hostName = properties.getProperty("host");
        String portNumber = properties.getProperty("port");
        //     dbName = properties.getProperty("db.name");
        //    String url = dbUrl.get(dbType) + "://" + hostName + ":" + portNumber + "/" + dbName;
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }

}

