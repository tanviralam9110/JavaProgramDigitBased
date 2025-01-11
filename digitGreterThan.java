package jspider.number;

public class digitGreterThan {
    public static void main(String[] args) {
        int num=1546278733;
        while (num>0){
                int rem = num%10;
            if (rem >=5){
                System.out.println(rem);
            }
            num=num/10;
        }
    }

}
