package com.mindsprint.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"alex");
        map.put(2,"bob");
        map.put(2,"catty");
        map.put(null,null);
        map.put(null,"sonam");//only one null key allowed
        System.out.println(map);
        System.out.println(map.size());
        Collection<String> data =map.values();
        System.out.println(data);
        for(String name: map.values()){
            System.out.println(name);
        }
       for(Map.Entry<Integer,String> entry: map.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
}
