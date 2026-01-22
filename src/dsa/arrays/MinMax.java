public class MinMax {

    static void minMax(int arr[]){
        int len = arr.length;

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < len; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 8, 2};
        minMax(arr);
    }
}
