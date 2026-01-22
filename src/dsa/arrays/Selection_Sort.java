public class Selection_Sort {

    static void selectionSort(int arr[]){
        int len = arr.length;
        

        for(int i = 0; i < len-1; i++){
            int min = i;
            for(int j = i+1; j < len; j++){
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,4,2};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
