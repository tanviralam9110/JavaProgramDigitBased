package jspider.number;

public class SumOfEvenDigit {
    public static void main(String[] args) {
        int num=5782686;
        int sum=0;
        while (num>0){
            int rem= num%10;
            if (rem%2==0){
                sum=sum+rem;
            }
            num=num/10;
        }
        System.out.println("The total sum of all even digit is : "+sum);
    }
}
