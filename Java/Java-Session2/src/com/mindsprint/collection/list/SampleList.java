package com.mindsprint.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleList {
    public static void main(String[] args) {
        ArrayList<User> users= new ArrayList<>();
        users.add(new User(1,"Sonam","India"));
        users.add(new User(2,"Alex","US"));
        users.add(new User(3,"Bob","UK"));
        users.add(new User(4,"John","AUS"));
//        System.out.println(users);
        Iterator<User> itr= users.iterator();
        while (itr.hasNext()){
            User ref= itr.next();
            System.out.println(ref.getId()+" "+ref.getName()+" "+ref.getCountry());
        }

    }
}
