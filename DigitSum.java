package jspider.number;

public class DigitSum {
    public static void main(String[] args) {
        int num=25635450;
        int sum=0;
        while (num>0){
            int rem = num%10;
            sum=sum+rem;
           // System.out.print(sum);
            num=num/10;
        }
        System.out.println("Total digit sum is: "+sum);
    }
}
