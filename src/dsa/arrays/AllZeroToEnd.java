package dsa.array;
import java.util.*;
public class AllZeroToEnd {

    public static void pushZeroToEnd(int arr[]){
        int len = arr.length;
        int[] result = new int[len];
        int index = 0;

        for(int i = 0; i < len; i++){
            if(arr[i] != 0){
                result[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < len; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,0,4,3,0,5,0};
        pushZeroToEnd(arr);

    }
}
