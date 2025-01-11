package jspider.number;

public class ProductEvenAndOddEachDigit {
    public static void main(String[] args) {
        int num=1432;
        int evenProduct=1;
        int oddProduct=1;
       while (num>0){
           int rem=num%10;
           if (num%2==0){
               evenProduct=evenProduct*rem;
           }
           else {
               if (num%2!=0){
                 oddProduct=oddProduct*rem;
               }
           }
           num=num/10;
       }
        System.out.println("The even product each digit is: "+evenProduct);
        System.out.println("The odd product each digit is: "+oddProduct);
    }
}
