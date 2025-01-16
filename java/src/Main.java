import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums =  new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        Arithmetic a = new Arithmetic();
        System.out.println(a.addition(nums));

        ArrayList<String> districts = new ArrayList<String>();
        districts.add("Kayonza");
        System.out.println(a.addition(districts));
    }
}