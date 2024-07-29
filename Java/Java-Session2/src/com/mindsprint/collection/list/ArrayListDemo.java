package com.mindsprint.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(78);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println("After Removal: "+list);
        System.out.println("Get Index 2: "+list.get(2));
        Iterator<Integer> itr =list.iterator();
        System.out.println("Simple Iterator");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator<Integer> listItr= list.listIterator();
        System.out.println("Forward Access");
        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }
        System.out.println("Backward Access");
        while (listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }

    }
}
