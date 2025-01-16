import java.util.ArrayList;
import java.util.List;

class arthmeticOps {
     public Object addition(ArrayList<?> numbers){
         Object sum=null;
         for(Object o:numbers){
             sum +=o.toString();
         }
         return  sum;
     };
     public static void main(){
        ArrayList <Integer> nums=new ArrayList<>();
         nums.add(10);
         nums.add(20);
         nums.add(30);

         arthmeticOps a=new arthmeticOps();
         System.out.println(a.addition(nums));
         List<String> characters=new ArrayList<>();
         characters.add("name");
         System.out.println(a.addition(characters));
     }
}
