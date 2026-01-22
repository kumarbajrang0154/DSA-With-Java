import java.util.*;
public class BinaryToDecimal {
    static void BinToDec(int bin){
        int mynum = bin;
        int pow = 0; 
        int dec = 0;

        while (bin > 0) {
            int lastDig = bin % 10;
            dec = dec + (lastDig * (int)Math.pow(2,pow));
            pow++;
            bin = bin / 10;
        }

        System.out.println("Decimal of "+ mynum+" : "+dec);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary digit: ");
        int bin = sc.nextInt();
        BinToDec(bin);
    }
}