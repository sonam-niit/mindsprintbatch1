package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicBatchUpdate {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        Scanner sc= new Scanner(System.in);

        try {
            String sql="insert into sample (name,country) values (?,?)";
            PreparedStatement statement= conn.prepareStatement(sql);
            while (true) {
                System.out.println("Enter Name");
                String name = sc.next();
                System.out.println("Enter Country");
                String country = sc.next();
                statement.setString(1, name);
                statement.setString(2, country);
                statement.addBatch();
                System.out.println("Dou you want to continue?");
                String op= sc.next();
                if(op.equals("n") || op.equals("N"))
                    break;
            }
            int count[]=statement.executeBatch();
            System.out.println(count.length+" records inserted");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
