package jspider.number;

public class BiggestDigit {
    public static void main(String[] args) {
        int num = 125864;
        int biggestDigit= 1;
        while (num > 0) {
            int rem=num%10;
            if (rem>biggestDigit) {
                biggestDigit=rem; // update biggest digit
            }
            num=num/10;
        }
        System.out.println(biggestDigit);


    }
}
