package javaCollection;

import java.util.HashMap;
import java.util.Iterator;

public class hashMapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> demo=new HashMap<Integer,String>();
        demo.put(1,"aine");
        demo.put(1,"kalisa");
        demo.put(2,"kalisa");
        System.out.println(demo);
        for (HashMap.Entry<Integer, String> e : demo.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());

    }
}
