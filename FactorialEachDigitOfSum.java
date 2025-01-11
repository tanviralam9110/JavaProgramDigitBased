package jspider.number;

public class FactorialEachDigitOfSum {
    public static void main(String[] args) {
        int num=12546;
        int sum=0;
        while (num>0){
            int rem=num%10;
            num=num/10;
            int fact=1;
            for (int i=1; i<=rem; i++){
                fact=fact*i;
            }
            sum=sum+fact;
            System.out.println("Factorial of "+rem+" : is : "+fact);
        }
        System.out.println("Total sum of factorial is: "+sum);
    }
}
