package com.learn.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    private String configPath;

    public ReadConfig(String configPath) {
super();
this.configPath=configPath;

    }


    public Properties getProperties() throws IOException, FileNotFoundException {
        FileReader reader=new FileReader(configPath);
        Properties properties=new Properties();
        properties.load(reader);
        return properties;
    }


    //This method Return the DBName
    public String getDBName() throws IOException {
        Properties properties = getProperties();
        return properties.getProperty("db.name");
    }






}


