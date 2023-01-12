package ValidPalindrome;

import java.util.Locale;

public class ValidPalindrome {
    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing
    all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include
    letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
     */
    public boolean isPalindrome(String s) {
        String regex="[^a-z0-9]";
        String text = s.toLowerCase().replaceAll(regex,"");
        String reverseString="";

        for(int i=text.length()-1; i>=0; i--){
            reverseString+=text.charAt(i);
        }
        return reverseString.equals(text)? true : false;

    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome=new ValidPalindrome();
        String text="A man, a plan, a canal: Panama";
        System.out.println(validPalindrome.isPalindrome(text)); //true
    }
}
