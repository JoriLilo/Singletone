package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class Main {

    public static void main(String[] args) {


        try ( Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                "root","Lilo123.")) {
            Statement statement=connection.createStatement();
            statement.execute( "DROP TABLE IF EXISTS COSTUMER");
            statement.execute( "CREATE TABLE IF NOT EXISTS COSTUMER " +
                    "(ID INT  PRIMARY KEY AUTO_INCREMENT ," +
                    "COSTUMER_NAME VARCHAR(20)," +
                    "COSTUMER_AGE INT)");


                boolean hasResult= statement.execute("SHOW COLUMNS FROM COSTUMER");
            ResultSet rs = connection.createStatement().executeQuery("se ");
            while (rs.next()){
                System.out.println(rs.getString(2));

                connection.close();
            }

        }catch (SQLException e){
           throw new RuntimeException(e);

       }
    }



    public static void connecton_withDatasouce(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/myShop");
        dataSource.setUser("root");
        dataSource.setPassword(" Lilo123.");

        try ( Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                "root","Lilo123.")) {
            ResultSet rs = connection.createStatement().executeQuery("select * from product ");
            while (rs.next()){
                System.out.println(rs.getString(2));

                connection.close();
            }

        }catch (SQLException e){
            throw new RuntimeException(e);

        }


    }
}