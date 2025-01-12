package jspider.number;

public class reverseNumber {
    public static void main(String[] args) {
        int num=10;
        while(num>0) {
            int rev = 0;
            int rem = num % 10;
            rev = rev*10+rem;
            num = num / 10;
            System.out.print(rev+" ");
        }
    }
}
