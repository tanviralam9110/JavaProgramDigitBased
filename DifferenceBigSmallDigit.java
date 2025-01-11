package jspider.number;

public class DifferenceBigSmallDigit {
    public static void main(String[] args) {
        int num=12543556;
        int biggestDigit=-1;
        int smallestDigit=10;
        while (num>0){
            int rem=num%10;
            if (rem>biggestDigit){
                biggestDigit=rem;
            }
            if (rem<smallestDigit){
                smallestDigit=rem;
            }
            num=num/10;
        }
        int difference=biggestDigit-smallestDigit;
        System.out.println("The differance between biggest and smallest number is: "+difference);
    }
}
