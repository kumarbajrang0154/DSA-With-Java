
import java.util.Scanner;

public class ntimesName {
    public static void namePrint(int start, int end){
        if(start > end){
            return;
        }else{
            System.out.println("Jai Shree Ram!");
            start++;
            namePrint(start, end);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int start = 1;
        namePrint(start, end);
    }
}
