public class HighestComonFactor {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 12;
        int hcf = findHCF(num1, num2);
        System.out.println("The Highest Common Factor of " + num1 + " and " + num2 + " is: " + hcf);
    }

    static int findHCF(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
