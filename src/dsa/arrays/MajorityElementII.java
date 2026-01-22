import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementII {

    static void majorityElement(int[] arr){
        int len = arr.length;
        int n = len/3;
        int freq = 1;
        int temp[] = new int[len];
        Arrays.sort(arr);

        for(int i = 1; i < len; i++){
            if (arr[i] == arr[i-1]) {
                freq++;

                if (freq > n) {
                    temp[arr[i]] = arr[i];
                }
            }else{
                freq = 1;
            }
        }

        for(int i = 0; i < len; i++){
            if (temp[i] != 0) {
                System.out.print(temp[i] + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,1,3,2,1,1};
        //int[] arr ={-5,3,-5};
        //int arr[] = {3,2,2,4,1,4};
        majorityElement(arr);
    }
}
