package javaCollection;

import java.util.Iterator;
import java.util.Stack;

public class stackDemo {
    public static void main(String[] args){
        Stack<String> stack1=new Stack<String>();
        stack1.push("aine");
        stack1.push("elie");
        stack1.push("jovin");
        System.out.println(stack1);
        Iterator<String> itr= stack1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");

        }

    }
}
