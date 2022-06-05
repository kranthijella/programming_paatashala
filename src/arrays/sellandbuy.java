package arrays;
import java.lang.Math;
public class sellandbuy {
    public static void main(String args[]) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
        public static int maxProfit(int[] prices) {

            int prefix[] = new int[prices.length];
            prefix[prices.length-1] = prices[prices.length-1];
            for(int i = prices.length-2;i>=0;i--){
                prefix[i] = Math.max(prices[i],prefix[i+1]);
            }
            int sum = 0;
            for(int i = 0;i<prices.length;i++){
                if(prefix[i] >= prices[i] ){
                    sum = Math.max(sum,prefix[i] - prices[i]);
                }
            }
            return sum;

        }
    }

