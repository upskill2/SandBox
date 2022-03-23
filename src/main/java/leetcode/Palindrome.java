package leetcode;

public class Palindrome {

    static int count_digit(int x)
    {
        int count = 0;
        while (x != 0) {
            x = x / 10;
            ++count;
        }
        return count;
    }
    public boolean isPalindrome(int  x) {

        boolean palindromeBoolean = false;

        int x2 = 0;
        x2=x;
        for (int i = count_digit(x); i >0; i--) {
            int palindrome = x--;
            if( palindrome==x2){
               return true;
                 }
        }
        return palindromeBoolean;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome(4444));
    }

}

