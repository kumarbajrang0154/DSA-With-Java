import java.util.*;
public class SecondLargestNumber {
    public static void secondLarger(int arr[]){
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;

        if (len < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        for(int i = 0; i < len; i++){
            if (arr[i] > max) { 
                Smax = max;
                max = arr[i];
            }else if(arr[i] > Smax && arr[i] != max){
                Smax = arr[i];
            }
        }

        if (Smax != Integer.MIN_VALUE) {
            System.out.println("Second largest element: "+Smax);
        }else{
            System.out.println("There is no second largest element.");
        }

    }
    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1,35};
        secondLarger(arr);
    }
}
