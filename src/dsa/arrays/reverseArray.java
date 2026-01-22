
public class reverseArray {
    // public static void reverse(int left, int right, int arr[]){
    //     if(left >= right){
    //         return;
    //     }else{
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         reverse(left+1, right-1, arr);
    //     }
    // }

    public static int reverse(int left, int right, int arr[]){
        if(left >= right){
            return 0; 
        } else {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            return reverse(left + 1, right - 1, arr);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int right = arr.length -1;
        int left = 0;
        reverse(left, right, arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
