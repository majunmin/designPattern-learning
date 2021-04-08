package com.mjm.part3.bridge.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * java SPI 代码
 *
 *
 */
public class DriverDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/learn?user=root&password=root";
        Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement();
        String query = "select * from test";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            rs.getString(1);
            rs.getInt(2);
        }

    }
}
