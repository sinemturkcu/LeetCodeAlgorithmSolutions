package PalindromeNumber;

public class PalindromeNumber {
    public  boolean isPalindrome(int x) {
        int number=x;
        int reverseNumber=0;
        int lastDigit;

        while(number>0){
            lastDigit=number%10;
            reverseNumber=reverseNumber*10+lastDigit;
            number/=10;
        }
        return x==reverseNumber ? true : false;

    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber=new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121)); //true
        System.out.println(palindromeNumber.isPalindrome(10)); //false
        System.out.println(palindromeNumber.isPalindrome(-121)); //false
        }
    }

