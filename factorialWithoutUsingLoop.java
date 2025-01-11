package Pattern;

public class factorialWithoutUsingLoop {
    public static int number(int n){
        if (n==0)
            return 1;
else
    return n*number (n-1);
    }

    public static void main(String[] args) {

        int num = 0;
        int fact = number(num);
        System.out.println( fact );
    }

    }



