package com.mindsprint.jdbc;

import java.sql.*;

public class CollableDemo {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        try {
            CallableStatement st= conn.prepareCall("call getAllAccounts()");
            ResultSet result =st.executeQuery();
            while (result.next()){
                System.out.println(result.getString(1)+" "+
                        result.getString(2)+" "+result.getDouble(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
