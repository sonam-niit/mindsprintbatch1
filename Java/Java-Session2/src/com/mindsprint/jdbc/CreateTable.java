package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        try {
            Statement statement= conn.createStatement();
            statement.execute("create table sample (id int primary key auto_increment" +
                    ",name varchar(20),country varchar(20))");
            System.out.println("Table created");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
