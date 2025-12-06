package com.codio.myservlet.voter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class VoterPersistenceLogic {

    public boolean SaveTheData(String name, int age, String gender, String number, String dateOfBirth, String result) {

        String DriverClass = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/management";
        String user = "root";
        String pass = "yasinmirza222";

        String insertQuery = "INSERT INTO voter_app(voter_name , voter_mobileno, voter_age, voter_dob, voter_gender, voter_result) VALUES(?,?,?,?,?,?)";

        try {
            Class.forName(DriverClass);
            Connection connection = DriverManager.getConnection(url, user, pass);

            PreparedStatement psmt = connection.prepareStatement(insertQuery);

            psmt.setString(1, name);
            psmt.setString(2, number);
            psmt.setInt(3, age);
            psmt.setString(4, dateOfBirth);
            psmt.setString(5, gender);
            psmt.setString(6, result);

            int rows = psmt.executeUpdate();

            psmt.close();
            connection.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
