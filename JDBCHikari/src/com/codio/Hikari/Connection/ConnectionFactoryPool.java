package com.codio.Hikari.Connection;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactoryPool {

    static Connection connection = null;
    static Statement statement = null;

    static String url = null;
    static String name = null;
    static String pass = null;
    static String poolSize = null;

    private static DataSource datasource = null;

    static {
        try {

            File file = new File("C:\\Users\\yasin\\Downloads\\database.properties");
            FileInputStream fis = new FileInputStream(file);

            Properties properties = new Properties();
            properties.load(fis);

            url = properties.getProperty("db.url");
            name = properties.getProperty("db.username");
            pass = properties.getProperty("db.password");
            poolSize = properties.getProperty("db.poolsize");

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(url);
            config.setUsername(name);
            config.setPassword(pass);
            config.setMaximumPoolSize(Integer.parseInt(poolSize));

            datasource = new HikariDataSource(config);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            connection = datasource.getConnection();
            statement = connection.createStatement();

            String insertQuery = "INSERT INTO students(student_id,student_name,student_age) VALUES(9,'Neha',30)";
            statement.executeUpdate(insertQuery);

            System.out.println("Record Inserted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

       
        
    }
}
