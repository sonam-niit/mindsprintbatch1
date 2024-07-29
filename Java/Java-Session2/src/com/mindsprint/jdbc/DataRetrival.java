package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRetrival {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        try {
            String sql="select * from sample";
            Statement statement= conn.createStatement();
            ResultSet result =statement.executeQuery(sql);
            while (result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+
                        " "+result.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
