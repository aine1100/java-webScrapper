package RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regDemo {
    public static void main(String[] args){
//        Pattern pattern1=Pattern.compile("foo");
//        Matcher matcher=pattern1.matcher("foofoofoo");
//        while(matcher.find()){
//            String group= matcher.group();
//            int start= matcher.start();
//            int end= matcher.end();
//            System.out.println(group+" start: "+start+" end:"+end);
//
//        }
        int vowelCount=0;
        Pattern pattern2=Pattern.compile("\sRCA &&[aieouAIEOU] ");
        Matcher matcher1=pattern2.matcher("Rwanda Coding Academy");
        while(matcher1.find()){
//            String group=matcher1.group();
//            int start=matcher1.start();
//            int end= matcher1.end();
//            System.out.println(group+" start: "+start+" end:"+end);
            vowelCount++;
        }
        System.out.println("the number of vowels are:"+vowelCount);

    }
}
