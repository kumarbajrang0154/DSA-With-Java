import java.util.Arrays;

public class Bubble_Sort {

    static void bubbleSort(int arr[]){
        int len = arr.length;

        for(int i = 0; i < len-1; i++){
            for(int j = 0; j < len-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // for(int i = 0; i < len; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,4,2,1};
        bubbleSort(arr);
    }
}
