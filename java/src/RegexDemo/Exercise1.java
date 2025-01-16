package RegexDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    public static void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String text=scanner.nextLine();


        Pattern pattern=Pattern.compile("[aieuoAIEUO0-9 \\W]");
        Matcher matcher1=pattern.matcher(text);
        String result=matcher1.replaceAll("");
        System.out.println(result);
    }
}
