package org.example;

import java.sql.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Connection conn= DBConfig.getConnection();
        if(conn!=null){
            System.out.println("DB Connected");
        }else{
            System.out.println("Error while connecting DB");
        }
    }
}
