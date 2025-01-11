package Pattern;

public class print1to100WithoutUsingLoop {
    public static void number(int start,int end){
        if (start<=end){
            System.out.print(start+"\t");
            number(start+1,end);
        }
    }
    public static void main(String[] args) {
         int start =1;
         int end = 100;

       // System.out.println(start + " " + end);
        number(start,end);
    }
}
