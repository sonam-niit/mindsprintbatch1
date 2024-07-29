package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDemo {
    public static void main(String[] args) {
        String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mindsprint";
        String username="root";
        String password="Sonam@123";
        try {
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(url,username,password);
            if(conn!=null)
                System.out.println("Connection Established");
            else
                System.out.println("Error while connecting");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Class Not Found: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
