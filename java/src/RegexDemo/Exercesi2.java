package RegexDemo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercesi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        String telephone = "0798380290";  // Example number

        // Correct pattern: Matches +25 or 25, followed by 0 or 7, then 8, 9, 3, or 2, and 7 more digits.
        Pattern pattern = Pattern.compile("^(\\+2507[2389]\\d{7}|07[2389]\\d{7})$");

        Matcher matcher = pattern.matcher(telephone);

        if (matcher.matches()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
