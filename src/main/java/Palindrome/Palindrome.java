package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input String: ");
        String s = scn.nextLine();
//        isPalindrome(s);
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length()==0) {
            return true;
        } else {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            }
        }
        return isPalindrome(s.substring(1,s.length()-1));
    }
}
