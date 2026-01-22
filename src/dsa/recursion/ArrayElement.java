package dsa.recursion;
import java.util.*;
public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,8,5,9,0,5,8,5,8,9};
        int n = arr.length-1;
        print(arr, n);
    }

    static void print(int[] arr, int n){
        if (n < 0) {
            return;
        }
        print(arr, n-1);
        System.out.print(arr[n] + " ");
    }
}
