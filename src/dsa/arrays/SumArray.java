public class SumArray {

    static void arraySum(int arr[]){
        int sum = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++){
            sum = sum + arr[i];
        }

        System.out.print("Total Sum: " + sum);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        arraySum(arr);
    }
}
