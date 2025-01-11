package jspider.number;

public class StrongNumber {
    public static void main(String[] args) {
        int num=145;
        int originalNumber=num;
        int sum = 0;
        while (num > 0) {
            int rem=num % 10;
            num= num/10;
            int fact= 1;
            for (int i=1; i<=rem; i++) {
                fact= fact*i;
            }
            sum= sum+fact;
        }
        System.out.println(sum);
        if (sum==originalNumber){
            System.out.println(originalNumber+"::It is strong number");
        }
        else {
            System.out.println(originalNumber+"It is not strong number");
        }
    }
}