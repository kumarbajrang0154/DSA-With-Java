import java.util.Scanner;

public class Odd_Even {
    public  static void oddEven(int num){
        if (num <= 0) {
            System.out.println("Invalid number.");
        }else if (num % 2 == 0) {
            System.out.println("Even number.");
        }else{
            System.out.println("Odd number.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        oddEven(num);
        sc.close();
    }
}
