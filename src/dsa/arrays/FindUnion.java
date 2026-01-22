import java.util.*;
public class FindUnion {
    static void findUnion(int arr1[], int arr2[]){
        Set<Integer> unionSet = new HashSet<>();
        for(int num : arr1){
            unionSet.add(num);
        }
        for(int num : arr2){
            unionSet.add(num);
        }
        System.out.print("Union of the two arrays: ");
        for(int num : unionSet){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        findUnion(arr1, arr2);
        sc.close();
    }
}
