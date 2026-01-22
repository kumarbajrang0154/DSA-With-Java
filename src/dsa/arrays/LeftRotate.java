import java.util.*;
public class LeftRotate {
    static void rotaterLeft(int[] arr){
        int len = arr.length;
        int temp = arr[0];
        for(int i = 0; i < len-1; i++){
            arr[i] = arr[i+1];
        }
        arr[len-1] = temp;

        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9};
       rotaterLeft(arr);
    }
}
