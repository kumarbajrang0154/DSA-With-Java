public class Countinteger {

    static int[] hashing = new int[101];  

    public static void hashStore(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            hashing[arr[i]]++;
        }
    }

    public static void counter(int key) {
        System.out.println("Count of " + key + " is: " + hashing[key]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 3, 2, 5, 4, 5, 1};
        int key = 1;

        hashStore(arr);   
        counter(key);      
    }
}
