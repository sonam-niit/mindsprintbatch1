package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsertion {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name");
        String name= sc.next();
        System.out.println("Enter Country");
        String country= sc.next();
        try {
            String sql="insert into sample (name,country) values (?,?)";
            PreparedStatement statement= conn.prepareStatement(sql);
            statement.setString(1,name);
            statement.setString(2,country);
            int count=statement.executeUpdate();
            System.out.println(count+" record inserted");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
