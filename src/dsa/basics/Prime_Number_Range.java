import java.util.Scanner;

public class Prime_Number_Range {
    public static void primeNumber(int start, int end){
        for(int i = start; i <= end; i++){
            int flag = 0;
            for(int j = 1; j <= i; j++){
                if (i % j == 0) {
                    flag++;
                }
            }

            if (flag == 2) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        primeNumber(start, end);
        sc.close();
    }
}
