package org.example;
import com.mysql.cj.jdbc.CallableStatement;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class test2 {




        public static void main(String[] args) {
            sampleQuery();
            samplePrepareStatment();
        }

    public static void samplePrepareStatment() {
            try( Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                "root", "Lilo123.")) {
                CallableStatement callableStatement= (CallableStatement) connection.prepareCall("");


            }catch (SQLException e){
                throw  new RuntimeException(e);
            }

    }

        public static void sampleQuery() {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                    "root", "Lilo123.")) {
                Statement statement = connection.createStatement();
                statement.execute("DROP TABLE IF EXISTS CUSTOMER");
                statement.execute("CREATE TABLE CUSTOMER (" +
                        "ID INT PRIMARY KEY AUTO_INCREMENT," +
                        "CUSTOMER_NAME VARCHAR(255)," +
                        "CUSTOMER_EMAIL VARCHAR(255)" +
                        ")");

                boolean hasResults = statement.execute("SHOW COLUMNS FROM CUSTOMER");
                if (hasResults) {
                    ResultSet resultSet = statement.getResultSet();
                    prettyPrintTable(resultSet);

                }

                System.out.println("--------");

                statement.execute("INSERT INTO CUSTOMER (CUSTOMER_NAME, CUSTOMER_EMAIL) VALUES ('customer1', 'test@gmail.com')");
                System.out.println(statement.getUpdateCount());

                ResultSet rs = statement.executeQuery("SELECT * FROM CUSTOMER");


            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        static void prettyPrintTable(ResultSet resultSet) throws SQLException {
            ResultSetMetaData rsMetadata = resultSet.getMetaData();

            // System.out.println("Number of returned columns is: " + rsMetadata.getColumnCount());

            for (int i = 1; i <= rsMetadata.getColumnCount(); i++)
                System.out.printf("%-20s", rsMetadata.getColumnName(i));
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= rsMetadata.getColumnCount(); i++) {
                    System.out.printf("%-20s", resultSet.getString(i));
                }
                System.out.println("-------");
            }
        }


        public static void connectionWithDriverManager() {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop",
                    "root", "Lilo123.")) {
                ResultSet rs = connection.createStatement().executeQuery("SHOW TABLES");
                while (rs.next())
                    System.out.println(rs.getString(1));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public static void connectionWithDataSource() throws SQLException {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setURL("jdbc:mysql://localhost:3306/myShop");

            Connection connection = null;
            try {
                connection = dataSource.getConnection();
                ResultSet rs = connection.createStatement().executeQuery("SHOW TABLES");
                while (rs.next())
                    System.out.println(rs.getString(1));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }

