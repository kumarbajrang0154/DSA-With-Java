// LeetCode 975 – Odd Even Jump

import java.util.*;
public class LeetCode_975_Odd_Even_Jump {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int result = oddEvenJumps(array);
        System.out.println("Number of good starting indices: " + result);
    }

    static int oddEvenJumps(int[] arr) {
        int n = arr.length;
        int[] nextHigher = new int[n];
        int[] nextLower = new int[n];
        Arrays.fill(nextHigher, -1);
        Arrays.fill(nextLower, -1);
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) ->
                arr[a] == arr[b] ? a - b : arr[a] - arr[b]);
        Stack<Integer> stack = new Stack<>();
        for (int i : idx) {
            while (!stack.isEmpty() && i > stack.peek()) {
                nextHigher[stack.pop()] = i;
            }
            stack.push(i);
        }
        Arrays.sort(idx, (a, b) ->
                arr[a] == arr[b] ? a - b : arr[b] - arr[a]);
        stack.clear();
        for (int i : idx) {
            while (!stack.isEmpty() && i > stack.peek()) {
                nextLower[stack.pop()] = i;
            }
            stack.push(i);
        }
        boolean[] odd = new boolean[n];
        boolean[] even = new boolean[n];
        odd[n - 1] = true;
        even[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            if (nextHigher[i] != -1)
                odd[i] = even[nextHigher[i]];
            if (nextLower[i] != -1)
                even[i] = odd[nextLower[i]];
        }
        int count = 0;
        for (boolean canReach : odd) {
            if (canReach) count++;
        }
        return count;
    }
}
