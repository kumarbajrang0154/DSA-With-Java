package dsa.recursion;
import java.util.*;
public class ArraySorted {
    static void main(String[] args){
        int[] arr = {7,8,5,9,0,5,8,5,8,9};
        int len = arr.length - 1;
        if(arraySorted(arr, len)){
            System.out.println("Array is sorted.");
        }else{
            System.out.println("Array is not sorted.");
        }
    }

    static boolean arraySorted(int[] arr, int n){
        if(n == 0) return true;
        if(arr[n] < arr[n-1]) return false;
        return arraySorted(arr,n-1);

    }
}
