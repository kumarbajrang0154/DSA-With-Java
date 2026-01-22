import java.util.Scanner;

public class sum_first_n {
    public static void sumN(int end){
        int sum = 0;
        for(int i = 0; i <= end; i++){
            sum += i;
        }
        System.out.println("Total sum of 0 to " + end + " : " + sum);
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        sumN(end);
        sc.close();
    }
}
