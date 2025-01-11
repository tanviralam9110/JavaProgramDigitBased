package jspider.number;

public class CountZero {
    public static void main(String[] args) {
        int num=502050450;
        int count=0;
        while (num>0){
            int rem = num%10;
            if (rem==0) {
                count++;
                System.out.println(rem);
            }

            num=num/10;
        }
        System.out.println("Total digit of 0 is: "+count);
    }
}
