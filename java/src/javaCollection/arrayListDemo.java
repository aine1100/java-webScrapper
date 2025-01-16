package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class arrayListDemo {
    public static void main(String[] args){
        List<Integer> numbers=new ArrayList<Integer>();
        List<Integer> number2=new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            numbers.add(i);
//            System.out.println(numbers);
//            System.out.println(numbers);
        }
        number2.addAll(numbers);
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
        System.out.println(number2);
        //when you use the list.get() method this one gets all elements and doesnt return the elements in an array based
    }
}
