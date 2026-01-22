package dsa.recursion;
import java.util.*;
public class ArrayElementMax {
    public static void main(String[] args) {
        int[] arr = {7,8,5,9,0,5,8,5,8,9,10};
        int len = arr.length - 1;
        int result = arrayMax(arr,len);
        System.out.println("Max Element: " + result);
    }

    static int arrayMax(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return Math.max(arr[n], arrayMax(arr, n - 1));
    }
}
