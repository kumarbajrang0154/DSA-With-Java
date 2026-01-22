import java.util.*;
public class SortedAsscending {
    static void asscendingSortCheck(int[] arr){
        int len = arr.length;
        int temp = arr[0];
        boolean isValid = false;

        for(int i = 1; i < len; i++){
            if(temp < arr[i]){
                isValid = true;
                continue;
            }else{
                isValid = false;
                break;
            }
        }

        if(isValid){
            System.out.println("Array is sorted and in asscending order.");
        }else{
            System.out.println("Array is not sorted and not in asscending order.");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,4,5,6};
        asscendingSortCheck(arr);
    }
}
