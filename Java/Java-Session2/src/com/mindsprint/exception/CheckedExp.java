package com.mindsprint.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExp {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("D://sonam/hello.txt");
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
