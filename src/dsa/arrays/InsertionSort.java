import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,4,2};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
    }

    System.out.println(Arrays.toString(arr));
    }
}
