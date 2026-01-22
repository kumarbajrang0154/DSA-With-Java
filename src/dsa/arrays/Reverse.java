public class Reverse {
    static void reverseArray(int arr[]){
        int len = arr.length;
        int temp[] = new int[len];
        
        for(int i = 0; i < len; i++){
            temp[i] = arr[len-i-1];
        }
        
        for(int i = 0; i < len; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args){
        int arr[] = {1,4,3,2,6,5};
        reverseArray(arr);
        int leng = arr.length;

        for(int i = 0; i < leng; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
