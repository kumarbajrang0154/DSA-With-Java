public class EvenOddCount {

    static void counter(int arr[]){
        int len = arr.length;
        int oddCOunt = 0;
        int evenCount = 0;

        for(int i = 0; i < len; i++){
            if (arr[i] % 2 == 0) {
                evenCount++;
            }else{
                oddCOunt++;
            }
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCOunt);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        counter(arr);
    }
}
