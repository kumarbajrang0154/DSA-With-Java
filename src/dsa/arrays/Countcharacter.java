public class Countcharacter {
    static int hashing[] = new int[256];
    public static void hasStore(char arr[]){
        for(int i = 0; i < arr.length; i++){
            hashing[arr[i]]++;
        }
    }
    public static void counter(char key){
        System.out.println(hashing[key]);
    }
    public static void main(String[] args) {
        char arr[] = {'a','f','b','a','c','d','b','e','c','f'};
        char key = 'a';
        hasStore(arr);
        counter(key);
    }
}
