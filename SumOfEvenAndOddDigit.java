package jspider.number;

public class SumOfEvenAndOddDigit {
    public static void main(String[] args) {
        int num=451684623;
        int evenSum =0;
        int oddSum=0;
        while (num>0){
            int rem=num%10;
            if (rem%2==0){
                evenSum=evenSum+rem;
            }       //else if (rem%2!=0) {
            else {
                oddSum=oddSum+rem;
            }
            num=num/10;
        }
        System.out.println("The total sum of even digit is: "+evenSum);
        System.out.println("The total sum of odd digit is :"+oddSum);
    }
}
