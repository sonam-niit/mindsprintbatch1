package com.mindsprint.collection.list;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Hello");
        list.add("Sonam");
        list.add("Yogesh");
        list.add("Vivek");
        System.out.println(list);
        list.remove(1);//remove based on Index
        System.out.println(list);
        list.remove("Hello"); //remove based on Object
        System.out.println(list);
        System.out.println(list.contains("Vivek"));

        Vector<Integer> v= new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println(stack);
        System.out.println("Removed: "+stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.push(40);
        System.out.println(stack);
    }
}
