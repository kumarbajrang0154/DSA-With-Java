import java.util.Scanner;

public class Greates_Number {
    public static void inputLength(Scanner sc){
        System.out.print("Enter number of inputs: ");
        int len = sc.nextInt();
         int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            System.out.print("Enter a  " + i + "th number: ");
            int num = sc.nextInt();
            if (max < num ) {
                max = num;
            }
        }
        System.out.println(max + " is greater number.");
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputLength(sc);
    }
}
