package com.mindsprint.main;

import com.mindsprint.dao.UseDAO;
import com.mindsprint.daoimpl.UserDAOImpl;
import com.mindsprint.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{

        UseDAO dao= new UserDAOImpl(); //Data Abstraction
        System.out.println(dao.getAllUsers());
//        try {
//            int count=dao.addUser(new User("bob","bob@gmail.com","UK"));
//            if(count>0)
//                System.out.println("Data Inserted successfully");
//            else
//                System.out.println("Error while inserting data");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
