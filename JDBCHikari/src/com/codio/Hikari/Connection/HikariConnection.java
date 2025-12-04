package com.codio.Hikari.Connection;

import java.sql.Connection;
import java.sql.Statement;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
public class HikariConnection {

    static Connection connection = null;
    static Statement statement = null;

    static String connectionString = "jdbc:mysql://localhost:3306/management";
    static String userName = "root";
    static String passWord = "yasinmirza222";
    static String insertQuery = "INSERT INTO students(student_id,student_name,student_age) VALUES(8,'Zainab',22)";

    public static void main(String[] args) {

        System.out.println("MAIN METHOD STARTED"); // Debug point

        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(connectionString);
        config.setUsername(userName);
        config.setPassword(passWord);

        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);

        HikariDataSource datasource = new HikariDataSource(config);

        try {
            connection = datasource.getConnection();
            System.out.println("Connected");

            statement = connection.createStatement();

            if (statement != null) {
                statement.executeUpdate(insertQuery);
                System.out.println("Insert Query Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

