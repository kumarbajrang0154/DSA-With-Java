public class SecondLargest {

    static void findSecondLargest(int[] arr) {
        int len = arr.length;

        if (len < 2) {
            System.out.println("Array me kam se kam 2 elements hone chahiye.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element exist nahi karta (sab same ho sakte hain)");
        } else {
            System.out.println("Second Largest Element: " + second);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        findSecondLargest(arr);
    }
}
