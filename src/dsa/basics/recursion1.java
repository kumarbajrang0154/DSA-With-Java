public class recursion1{

    // Without any Condition which will provide Stack overflow........
    // public static void print(int count){
    //     System.out.println(count);
    //     count++;
    //     print(count);
    // }

    // With condition which will stop at given condition and use upto needed memory..........
    public static void print(int count){
        if(count == 10){
            return;
        }else{
            System.out.println(count);
            count++;
            print(count);
        }
    }

    public static void main(String args[]){
        int count = 0;
        print(count);
    }
}