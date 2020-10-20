package lab;

import java.util.Scanner;

public class num8 {
    public static boolean isPalindrome(String word) {
        //Strip out non-alphanumeric characters from string
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]","");
        //Check for palindrome quality recursively
        return checkPalindrome(cleanWord);
    }
    private static boolean checkPalindrome(String word) {
        if(word.length() < 2) { return true; }
        char first  = word.charAt(0);
        char last   = word.charAt(word.length()-1);
        if(  first != last  ) {  return false; }
        else { return checkPalindrome(word.substring(1,word.length()-1)); }

    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово:");
        String text = scan.nextLine();
        isPalindrome(text);
        if(isPalindrome(text) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
