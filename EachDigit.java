package jspider.number;

public class EachDigit {
    public static void main(String[] args) {
        int num = 236475728;
        while (num>0){
            int rem=num%10;
            System.out.print(rem+" ");
            num=num/10;
        }
        }

    }