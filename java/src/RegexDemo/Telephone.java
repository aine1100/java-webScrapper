package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephone {
    public static Boolean NumberChecker(String number){
        Pattern pattern=Pattern.compile("(\\+2507[2389]\\d{7}| 07[2389]\\d{7})$");
        Matcher matcher=pattern.matcher(number);
        //
        if(matcher.matches()){
            System.out.println("It is a rwandan phone");
            return true;
        }else {
            System.out.println("It is not a rwandan number");
            return false;
        }

    };
    public static void main(String[] args){
        System.out.println(NumberChecker("+25079809091")) ;

    }
}
