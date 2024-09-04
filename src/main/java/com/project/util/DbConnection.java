package com.project.util;

import java.sql.*;

public class DbConnection {
    private static Connection conn = null;
    private static void startConnection() {
        try {
            String url = "jdbc:sqlite:/Users/asagarw/Employee_Profile/Employee_Profile_Management/employee.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connected!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
	public static Connection connect() {
		if (conn == null) {
            startConnection();
        }
        return conn;
	}
}
