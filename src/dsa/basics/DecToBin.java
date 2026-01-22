import java.util.*;

public class DecToBin {

    static void decToBin(int dec){
        int num = dec;
        int pow = 0;
        int bin = 0;

        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("Binary of "+num+" : "+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int dec = sc.nextInt();
        decToBin(dec);
    }
}
