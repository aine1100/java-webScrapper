package javaCollection;

import java.util.Hashtable;
import java.util.Vector;

public class collectionDemo {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4};
        Vector<Integer> v=new Vector<Integer>();
        Hashtable<Integer,String> h=new Hashtable<Integer,String>();
        v.addElement(1);
        v.addElement(2);
        h.put(1,"geeks");
        h.put(1,"4geeks");

        System.out.println(arr[0]);//access the first element of the array
        System.out.println(v.elementAt(0));//access the element of the vector i mean the first
        System.out.println(h.get(1));//access the first element of the hashtable



    }
}
