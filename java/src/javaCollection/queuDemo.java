package javaCollection;

import java.util.PriorityQueue;

public class queuDemo {
    public static void main (String[] args){
        PriorityQueue<Integer> priority=new PriorityQueue<Integer>();
        priority.add(10);
        priority.add(20);
        priority.add(30);
        System.out.println(priority.peek());//it prints the top most element
        System.out.println(priority.poll());//it prints the top most element and removes it from the
        System.out.println(priority);
    }
}
