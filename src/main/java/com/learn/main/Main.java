package com.learn.main;

import com.learn.tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String configPath;
        configPath = "C:\\Users\\suraj_rawat\\IdeaProjects\\19-12-22\\src\\main\\resources\\config.properties";
      //  ReadConfig configFile = new ReadConfig(configPath);
        Boolean key = true;
        while (key) {
            System.out.println("Choose an Option:");
            System.out.println();
            System.out.println("*****************************************************************");
            System.out.println("1. Create table in Database");
            System.out.println("2. Insert data into Database");
            System.out.println("3. Update data into Database");
            System.out.println("4. Delete data from Database");
            System.out.println("5. Select data from Database");
            System.out.println("6. Generate MetaData");
            System.out.println("7. Exit");
            System.out.println("*****************************************************************");

            try {

                int priority;
                Scanner scanner = new Scanner(System.in);
                priority = scanner.nextInt();

                switch (priority) {
                    case 1:
                        CreateDB.createDB(configPath);


                        break;

                    case 2: {
                        InsertDataIntoDB.insertData(configPath);


                        break;
                    }
                    case 3: {

                        UpdateDataFromDB.updateData(configPath);


                        break;

                    }
                    case 4: {

                        DeleteDataFromDB.deleteDB(configPath);


                        break;

                    }
                    case 5: {

                        SelectDataIntoDB.selectData(configPath);


                        break;

                    }
                    case 6: {
                        MetaDataInformation.getMetaData(configPath);

                        break;

                    }
                    default:
                        System.out.println("Something went wrong");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}