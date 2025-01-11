package jspider.number;
public class PalindromeNumber {
    public static void main(String[] args) {
        int num=323;
        int originalN=num;
        int rev =0;
        while (num>0) {
            int rem = num % 10;
            rev = rev *10 +rem;
            num = num / 10;
        }
        System.out.println(rev);
        if (originalN== rev){
            System.out.println(originalN+": is palindrome number");
        }
        else {
            System.out.println(originalN+": is not palindrome number");
        }
    }
}
