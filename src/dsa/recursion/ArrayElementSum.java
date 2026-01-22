package dsa.recursion;
import java.util.*;
public class ArrayElementSum {
    static void main(String[] args){
        int[] arr = {7,8,5,9,0,5,8,5,8,9};
        int len = arr.length - 1;
        int result = sum(arr,len);
        System.out.print("Total sum: " + result);
    }

    static int sum(int[] arr, int n){
        if(n < 0){
            return 0;
        }
        return arr[n] + sum(arr, n - 1);
    }
}
