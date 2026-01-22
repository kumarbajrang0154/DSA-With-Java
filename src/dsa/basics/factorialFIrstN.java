import java.util.Scanner;

public class factorialFIrstN {

    public static int factorial(int min, int max){
        if(max >= min){
            return max * factorial(min, max-1);
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int min = 1;
        int result = factorial(min, max);
        System.out.println("Factorial from "+min+" to "+max+" : "+result);
    }
}
