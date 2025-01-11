package jspider.number;

public class CountDigitLessThan {
    public static void main(String[] args) {
        int num = 1456653;
        int count = 0;
        while (num>0){
            int rem=num%10;
            if (rem<=5){
                count++;
            }
            num=num/10;
        }
        System.out.println("The  number less than equal to 5  total count is: "+count);

    }
}