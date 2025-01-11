package jspider.number;

public class onlyEvenDigit {
    public static void main(String[] args) {
        int num=556489654;
        while (num>0){
            if (num%2==0) {
                int rem = num % 10;
                System.out.println(rem);
            }
                num=num/10;
        }
    }
}
