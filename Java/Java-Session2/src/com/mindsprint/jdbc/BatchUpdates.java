package com.mindsprint.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdates {
    public static void main(String[] args) {
        Connection conn= DBConfig.getConnection();
        try {
            Statement statement= conn.createStatement();
            statement.addBatch("insert into sample (name,country) values ('alex','UK')");
            statement.addBatch("insert into sample (name,country) values ('bob','US')");
            statement.addBatch("insert into sample (name,country) values ('catty','US')");
            statement.addBatch("insert into sample (name,country) values ('john','UK')");
            int[] count= statement.executeBatch();
            System.out.println(count.length+" Records Inserted in the Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
