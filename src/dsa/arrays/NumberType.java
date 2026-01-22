import java.util.*;
public class NumberType {
    static void numberTypeConter(int[] arr){
        int len = arr.length;
        int positive = 0, negative = 0, zero = 0;

        for(int i = 0; i < len; i++){
            if (arr[i] > 0) {
                positive++;
            }else if (arr[i] < 0) {
                negative++;
            }else{
                zero++;
            }
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,0,4,-5,0};
        numberTypeConter(arr);
    }
}
