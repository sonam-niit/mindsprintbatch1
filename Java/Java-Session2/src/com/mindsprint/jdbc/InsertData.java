package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        try {
            Statement statement= conn.createStatement();
            String sql="insert into sample (name,country) values ('sonam','india')";
            int count=statement.executeUpdate(sql);
            System.out.println(count+" record inserted");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
