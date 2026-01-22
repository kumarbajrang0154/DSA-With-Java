public class NextPermutation {

    static void generateNextPermutation(int arr[]){
        int len = arr.length;
        int pivot = -1;

        for(int i = len - 2; i >= 0; i--){
            if (arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            for(int j = len-1; j >= 0; j--){
                System.out.print(arr[j] + " ");
            }
        }

        for(int i = len - 1; i > pivot; i--){
            if (arr[i] > arr[pivot]) {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        int m = pivot;
        int n = len -1;
        while (m <= n) {
            int temp = arr[m];
            arr[m] = arr[n];
            arr[n] = temp;
            m++;
            n--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        int leng = arr.length;
        generateNextPermutation(arr);
        for(int i = 0; i < leng; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
