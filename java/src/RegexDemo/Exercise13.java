package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise13 {
    public static void main(String[] args){
        String sentence="food is good food";
        Pattern pattern=Pattern.compile("food");
        Matcher matcher=pattern.matcher(sentence);
        int count=0;
        while(matcher.find()){
            count ++;

        }
        System.out.println(count);

    }
}
