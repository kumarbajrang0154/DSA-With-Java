import java.util.Scanner;

public class Range_Sum {
    public static void rangeSum(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        System.out.println("Total sum from "+start+" to "+end+": "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        rangeSum(start, end);
        sc.close();
    }
}
