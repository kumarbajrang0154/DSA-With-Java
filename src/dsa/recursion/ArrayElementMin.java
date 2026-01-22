package dsa.recursion;
import java.util.*;
public class ArrayElementMin {
    public static void main(String[] args) {
        int[] arr = {7,8,5,9,0,5,8,5,8,9,10};
        int len = arr.length - 1;
        int result = arrayMin(arr,len);
        System.out.println("Min Element: " + result);
    }

    static int arrayMin(int[] arr, int n){
    if (n == 0) {
        return arr[0];
    }
    return Math.min(arr[n], arrayMin(arr, n - 1));
}

}
