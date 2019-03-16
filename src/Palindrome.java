/**
 * A Java program to determine if certain set of character
 * is Palindrome or not.
 *
 * (c) copyright Adedeji Stephen Adedokun.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String argv[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input what to check if it is palindrome: \n");
        // Read for string from stdInput
        String checkFor = scanner.nextLine();
        Palindrome p = new Palindrome();
        System.out.printf("%s is %s", checkFor,
                p.isPalindrome(checkFor) ? "is palindrome" : "is not palindrome");
    }

    public boolean isPalindrome(String string)
    {
        int lenOfString = string.length();
        int halfOfString = Math.floorDiv(lenOfString, 2);
        boolean isTrue = true;
        for (int i = 0; i <= halfOfString; i++) {
            if ( !isTrue) break;
            if (string.charAt(i) != string.charAt(lenOfString - (i + 1)))
                isTrue = false;
        }

        return isTrue;
    }
}
