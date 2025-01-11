package jspider.number;

public class CountOddDigit {
    public static void main(String[] args) {
        int num=45871654;
        int count=0;
        while (num>0){
            int rem= num%10;
            if (rem%2 !=0){
                count++;
            }
            num=num/10;
        }
        System.out.println("The total odd number count is: "+count);
    }
}
