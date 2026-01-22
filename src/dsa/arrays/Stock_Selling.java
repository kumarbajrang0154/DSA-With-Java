import java.util.*;

public class Stock_Selling {
    
    public static int buyAndSell(int price[]){
        int len = price.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i = 0; i < len; i++){
            int sellPrice = price[i];
            if (buyPrice < sellPrice) {
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = sellPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = {7,1,3,6,4,5};
        int result = buyAndSell(price);
        System.out.println("Maximum Profit: " +result);
    }
}
