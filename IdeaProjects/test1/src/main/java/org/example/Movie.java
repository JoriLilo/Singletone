package org.example;

import java.sql.*;

import static org.example.test2.prettyPrintTable;


public class Movie {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                "root", "Lilo123.")) {


            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS Movie");
            statement.execute("CREATE TABLE Movie (" +
                    "ID INT PRIMARY KEY AUTO_INCREMENT," +
                    "TITLE VARCHAR(255)," +
                    " GENRE VARCHAR(255)," +
                    "YearOfRelease int" +
                    ")");

            boolean hasResults = statement.execute("SHOW COLUMNS FROM Movie");
            if (hasResults) {
                ResultSet resultSet = statement.getResultSet();
                prettyPrintTable(resultSet);


            }

            System.out.println("--------");


            statement.execute("INSERT INTO Movie (TITLE,GENRE,YearOfRelease) VALUES ('test1', 'Drama',2020)");
            statement.execute("INSERT INTO Movie (TITLE,GENRE,YearOfRelease) VALUES ('test2', 'Action',2023)");
            statement.execute("INSERT INTO Movie (TITLE,GENRE,YearOfRelease) VALUES ('test3', 'romance',2020)");
         
            System.out.println(statement.getUpdateCount());


            PreparedStatement preparedStatement = connection.prepareStatement(
                    "Update Movie set Title='test' where id=?");

            preparedStatement.setInt(1, 1);
            preparedStatement.execute();


            ResultSet rs = statement.executeQuery("SELECT * FROM Movie");
            prettyPrintTable(rs);


        }  catch (SQLException e) {
            throw new RuntimeException(e);
            }
    }
}
