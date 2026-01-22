import java.util.Scanner;

public class Prime_Number {
    public static void primeOrNot(int num){
        int flag = 0;
        for(int i = 1; i <= num; i++){
            if (num % i == 0) {
                flag += 1;
            }
        }
        // System.out.println(flag);

        if (flag == 2) {
            System.out.println("Prime number.");
        }else{
            System.out.println("Not Prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        primeOrNot(num);
        sc.close();
    }
}
