package jspider.number;

public class CountEvenDigit {
    public static void main(String[] args) {
        int num=15848634;
        int count=0;
        while (num>0){
            if (num%2==0){
                int rem= num%10;
                count++;
            }
            num=num/10;
        }
        System.out.println("The total even number count is: "+count);
    }
}
