package jspider.number;

public class FactorialEachDigit {
    public static void main(String[] args) {
        int num=14536;
        while (num>0){
            int rem=num%10;
            num=num/10;
            int fact =1;
            for (int i=1; i<=rem;i++){
                fact=fact*i;
            }

            System.out.println("Factorial of: "+rem+" :is :"+fact);
        }
    }
}