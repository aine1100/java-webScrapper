package javaCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class hashSetDemo {
    //hashset provides unordered elements while treeset provides ordered element and all doesnt allow duplicate values
    public static void main(String[] args){
        Set<String> set1=new TreeSet<String>();
        set1.add("aine");
        set1.add("keza");
        set1.add("aine");
        set1.add("jovin");
        System.out.println(set1);
        Iterator<String> it=set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
