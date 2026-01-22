import java.util.*;
public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {6,3,5,1,4,2};
        cycleSort(arr);
    }

    static void cycleSort(int[] arr){
        int len = arr.length;

        for(int cycle_start = 0; cycle_start <= len - 2; cycle_start++){
            int item = arr[cycle_start];
            int pos = cycle_start;

            for(int i = cycle_start + 1; i < len; i++){
                if(arr[i] < item){
                    pos++;
                }
            }

            if(pos == cycle_start){
                continue;
            }

            while(item == arr[pos]){
                pos++;
            }

            if(pos != cycle_start){
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while(pos != cycle_start){
                pos = cycle_start;

                for(int i = cycle_start + 1; i < len; i++){
                    if(arr[i] < item){
                        pos++;
                    }
                }

                while(item == arr[pos]){
                    pos++;
                }

                if(item != arr[pos]){
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
