import java.util.*;
public class TwoSum {
    static void sumTwo(int[] arr1, int[] arr2){

        //for Array1 reverse order number..........
        int r1 = 0;
        for(int i = arr1.length - 1; i >= 0; i--){
            r1 = r1*10 + arr1[i];
        }
        // System.out.println(r1);

        //for Array2 reverse order number..........
        int r2 = 0;
        for(int i = arr2.length - 1; i >= 0; i--){
            r2 = r2*10 + arr2[i];
        }
        // System.out.println(r2);

        int sum = r1 + r2; 

        int len = Math.max(arr1.length, arr2.length); 
        // System.out.println(len);

        int[] sumArr = new int[len];

        int temp = sum; 
        // System.out.println(temp);
        // System.out.println(sum);
        int i = 0;

        while(temp != 0){
            int div = temp % 10;
            sumArr[i] = div;
            temp = temp /10;
            i++;
        }

        // System.out.println(temp);
        // System.out.println(sum);

        // for(int num : sumArr){
        //     System.out.print(num + " ");
        // }

        System.out.println(Arrays.toString(sumArr));
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        sumTwo(arr1, arr2);
    }
}
